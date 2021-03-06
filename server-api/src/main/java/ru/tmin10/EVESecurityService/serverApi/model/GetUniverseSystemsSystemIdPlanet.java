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
import java.util.ArrayList;
import java.util.List;

/**
 * planet object
 */
@ApiModel(description = "planet object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetUniverseSystemsSystemIdPlanet {
  @SerializedName("moons")
  private List<Integer> moons = new ArrayList<Integer>();

  @SerializedName("planet_id")
  private Integer planetId = null;

  public GetUniverseSystemsSystemIdPlanet moons(List<Integer> moons) {
    this.moons = moons;
    return this;
  }

  public GetUniverseSystemsSystemIdPlanet addMoonsItem(Integer moonsItem) {
    this.moons.add(moonsItem);
    return this;
  }

   /**
   * moons array
   * @return moons
  **/
  @ApiModelProperty(example = "null", value = "moons array")
  public List<Integer> getMoons() {
    return moons;
  }

  public void setMoons(List<Integer> moons) {
    this.moons = moons;
  }

  public GetUniverseSystemsSystemIdPlanet planetId(Integer planetId) {
    this.planetId = planetId;
    return this;
  }

   /**
   * planet_id integer
   * @return planetId
  **/
  @ApiModelProperty(example = "null", required = true, value = "planet_id integer")
  public Integer getPlanetId() {
    return planetId;
  }

  public void setPlanetId(Integer planetId) {
    this.planetId = planetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemsSystemIdPlanet getUniverseSystemsSystemIdPlanet = (GetUniverseSystemsSystemIdPlanet) o;
    return Objects.equals(this.moons, getUniverseSystemsSystemIdPlanet.moons) &&
        Objects.equals(this.planetId, getUniverseSystemsSystemIdPlanet.planetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moons, planetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemsSystemIdPlanet {\n");
    
    sb.append("    moons: ").append(toIndentedString(moons)).append("\n");
    sb.append("    planetId: ").append(toIndentedString(planetId)).append("\n");
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

