package com.api.javademo.configuration;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import io.prometheus.client.Counter;
import io.prometheus.client.Summary;

@Component
public class RequestCounterInterceptor extends HandlerInterceptorAdapter {

    private static final Counter requestTotal = Counter.build()
         .name("http_requests_total")
         .labelNames("method", "handler", "status")
         .help("Http Request Total").register();
    
    private static final String REQ_PARAM_TIMING = "timing";

    // @formatter:off
    // Note (1)
    private static final Summary responseTimeInMs = Summary
         .build()
         .name("http_response_time_milliseconds")
         .labelNames("method", "handler", "status")
         .help("Request completed time in milliseconds")
         .register();
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         // Note (2)
         request.setAttribute(REQ_PARAM_TIMING, System.currentTimeMillis());
         return true;
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e)
throws Exception {
         // Update counters
         String handlerLabel = handler.toString();
         // get short form of handler method name
         if (handler instanceof HandlerMethod) {
              Method method = ((HandlerMethod) handler).getMethod();
              handlerLabel = method.getDeclaringClass().getSimpleName() + "." + method.getName();
         }
         
         Long timingAttr = (Long) request.getAttribute(REQ_PARAM_TIMING);
         long completedTime = System.currentTimeMillis() - timingAttr;
     
         requestTotal.labels(request.getMethod(), handlerLabel, Integer.toString(response.getStatus())).inc();
         responseTimeInMs.labels(request.getMethod(), handlerLabel, Integer.toString(response.getStatus())).observe(
        		 completedTime);
    }
}