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
 * current_vul object
 */
@ApiModel(description = "current_vul object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetCorporationsCorporationIdStructuresCurrentVul {
  @SerializedName("day")
  private Integer day = null;

  @SerializedName("hour")
  private Integer hour = null;

  public GetCorporationsCorporationIdStructuresCurrentVul day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * day integer
   * @return day
  **/
  @ApiModelProperty(example = "null", required = true, value = "day integer")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public GetCorporationsCorporationIdStructuresCurrentVul hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * hour integer
   * @return hour
  **/
  @ApiModelProperty(example = "null", required = true, value = "hour integer")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStructuresCurrentVul getCorporationsCorporationIdStructuresCurrentVul = (GetCorporationsCorporationIdStructuresCurrentVul) o;
    return Objects.equals(this.day, getCorporationsCorporationIdStructuresCurrentVul.day) &&
        Objects.equals(this.hour, getCorporationsCorporationIdStructuresCurrentVul.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStructuresCurrentVul {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

