package com.api.javademo.exception;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.LocaleResolver;
import com.api.javademo.exception.CustomException;
import com.api.javademo.exception.CustomExceptionHandler;
import com.api.javademo.exception.ErrorResponse;
import com.api.javademo.exception.Error.SeverityEnum;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * CustomExceptionHandler is a controller advice which captures any of the exceptions in the process of api execution.
 *
 */
@ControllerAdvice
public class CustomExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(CustomExceptionHandler.class);

	private static final String FAILED = "FAILED";
	private static final String ERROR_400 = "MSVF001";
	private static final String ERROR_500 = "MSVF002";
	
	
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired(required = false)
	private HttpServletRequest request;

	/** The locale resolver. */
	@Autowired(required = false)
	private LocaleResolver localeResolver;


	public Locale getCurrentLocale() {
		return (request != null && localeResolver != null) ? localeResolver.resolveLocale(request)
				: Locale.getDefault();
	}

	public String getMessage(String key) {
		String result = null;
		if (key != null && !key.isEmpty() ) {
			result = messageSource.getMessage(key, new Object[0], getCurrentLocale());
		}
		return result;
	}
	//

	private HttpHeaders getResponseHeaders(WebRequest request) {
		// get header values
		// response headers created first
		final MultiValueMap<String, String> map = buildResponseMap(request);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.putAll(map);

		// return headers for responses
		return httpHeaders;
	}

	private MultiValueMap<String, String> buildResponseMap(WebRequest request) {
		final MultiValueMap<String, String> map;
		map = new LinkedMultiValueMap<>();
		
		return map;
	}

	@ExceptionHandler(value = { MissingServletRequestParameterException.class, MissingPathVariableException.class,HttpRequestMethodNotSupportedException.class,UnsatisfiedServletRequestParameterException.class,
			ServletRequestBindingException.class, ConstraintViolationException.class, IllegalArgumentException.class,MethodArgumentNotValidException.class })
	public ResponseEntity<Object> handleRequestException(Exception ex, WebRequest request) {
		// build header responses
		final HttpHeaders httpHeaders = getResponseHeaders(request);

		// error response pojo
		final ErrorResponse er;
		
			er = ErrorResponse.instance(SeverityEnum.ERROR, getMessage(ERROR_400), "400", ex.getMessage(), FAILED, true,ERROR_400);
		
		
		// return response
		return ResponseEntity.status(400).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body(er.toString());
	}

	@ExceptionHandler(value = { CustomException.class,RuntimeException.class })
	public ResponseEntity<ErrorResponse> handleRequestException(CustomException ce, WebRequest request) {
		// build header responses
		final HttpHeaders httpHeaders = getResponseHeaders(request);

		// send error response
		return ResponseEntity.status(ce.getHttpCode()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON)
				.body(ce.getErrorResponse());
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<ErrorResponse> handleGeneralException(Exception ex, WebRequest request) {
		// build error response
		final ErrorResponse errorResponse;
		errorResponse = ErrorResponse.instance(SeverityEnum.ERROR, getMessage(ERROR_500), "500", ex.getMessage(), FAILED, true,ERROR_500);
		
		
		// build headers
		final HttpHeaders httpHeaders = getResponseHeaders(request);

		// global log
		log.error("global error occured in controller, cause: " + ex.getMessage(), ex);

		// send error response
		return ResponseEntity.status(500).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON)
				.body(errorResponse);
	}

	@ExceptionHandler(value = { HttpClientErrorException.class, HttpServerErrorException.class })
	public ResponseEntity<ErrorResponse> handleHTTPException(HttpStatusCodeException e, WebRequest request) {
		// build error response
		final String errorResponseText = e.getResponseBodyAsString();
		final ObjectMapper mapper = new ObjectMapper();

		ErrorResponse errorResponse = new ErrorResponse();

		try {
			errorResponse = mapper.readValue(errorResponseText, ErrorResponse.class);
		} catch (IOException ioe) {
			log.error("cannot read error response [" + errorResponseText
					+ "] to convert to Object --> ErrorResponse, cause: " + ioe.getMessage(), ioe);
		}

		// build headers
		final HttpHeaders httpHeaders = getResponseHeaders(request);

		// global log
		log.error("HTTP Server error occured in controller, cause: " + e.getMessage(), e);

		// send error response
		return ResponseEntity.status(e.getStatusCode().value()).headers(httpHeaders)
				.contentType(MediaType.APPLICATION_JSON).body(errorResponse);
	}
}
