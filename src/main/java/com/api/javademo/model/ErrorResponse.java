package com.api.javademo.model;

import java.util.Objects;
import org.springframework.format.annotation.*;
import com.api.javademo.model.Error;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-26T16:12:13.568+05:30")

public class ErrorResponse   {
  @JsonProperty("fatalError")
  private Boolean fatalError = null;

  @JsonProperty("error")
  private Error error = null;

  public ErrorResponse fatalError(Boolean fatalError) {
    this.fatalError = fatalError;
    return this;
  }

   /**
   * Get fatalError
   * @return fatalError
  **/
  @ApiModelProperty(value = "")


  public Boolean getFatalError() {
    return fatalError;
  }

  public void setFatalError(Boolean fatalError) {
    this.fatalError = fatalError;
  }

  public ErrorResponse error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.fatalError, errorResponse.fatalError) &&
        Objects.equals(this.error, errorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fatalError, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    fatalError: ").append(toIndentedString(fatalError)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

