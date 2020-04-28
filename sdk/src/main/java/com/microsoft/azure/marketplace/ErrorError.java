/*
 * SaaS fulfillment APIs, version 2
 * This spec details the APIs that enable partners to sell their SaaS applications in the AppSource marketplace and the Azure Marketplace. These APIs are a requirement for transactable SaaS offers on the AppSource and Azure Marketplace.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.microsoft.azure.marketplace;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.azure.marketplace.ErrorDetail;
import com.microsoft.azure.marketplace.ErrorErrorAdditionalInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ErrorError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-19T20:04:00.284-07:00[America/Los_Angeles]")
public class ErrorError {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("details")
  private List<ErrorDetail> details = null;

  @SerializedName("additionalInfo")
  private ErrorErrorAdditionalInfo additionalInfo = null;

  public ErrorError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorError target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Schema(description = "")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public ErrorError details(List<ErrorDetail> details) {
    this.details = details;
    return this;
  }

  public ErrorError addDetailsItem(ErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<ErrorDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public List<ErrorDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ErrorDetail> details) {
    this.details = details;
  }

  public ErrorError additionalInfo(ErrorErrorAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @Schema(description = "")
  public ErrorErrorAdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(ErrorErrorAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(this.code, errorError.code) &&
        Objects.equals(this.message, errorError.message) &&
        Objects.equals(this.target, errorError.target) &&
        Objects.equals(this.details, errorError.details) &&
        Objects.equals(this.additionalInfo, errorError.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, target, details, additionalInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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