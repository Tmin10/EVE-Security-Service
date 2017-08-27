/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.4.9.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.tmin10.EVESecurityService.serverApi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Unprocessable entity
 */
@ApiModel(description = "Unprocessable entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetKillmailsKillmailIdKillmailHashUnprocessableEntity {
  @SerializedName("error")
  private String error = null;

  public GetKillmailsKillmailIdKillmailHashUnprocessableEntity error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Unprocessable entity message
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "Unprocessable entity message")
  public String getError() {
    return error;
  }

  public void setError(String error) {
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
    GetKillmailsKillmailIdKillmailHashUnprocessableEntity getKillmailsKillmailIdKillmailHashUnprocessableEntity = (GetKillmailsKillmailIdKillmailHashUnprocessableEntity) o;
    return Objects.equals(this.error, getKillmailsKillmailIdKillmailHashUnprocessableEntity.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashUnprocessableEntity {\n");
    
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

