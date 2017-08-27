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
import ru.tmin10.EVESecurityService.serverApi.model.GetUniverseSystemsSystemIdPlanet;
import ru.tmin10.EVESecurityService.serverApi.model.GetUniverseSystemsSystemIdPosition;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetUniverseSystemsSystemIdOk {
  @SerializedName("constellation_id")
  private Integer constellationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("planets")
  private List<GetUniverseSystemsSystemIdPlanet> planets = new ArrayList<GetUniverseSystemsSystemIdPlanet>();

  @SerializedName("position")
  private GetUniverseSystemsSystemIdPosition position = null;

  @SerializedName("security_class")
  private String securityClass = null;

  @SerializedName("security_status")
  private Float securityStatus = null;

  @SerializedName("stargates")
  private List<Integer> stargates = new ArrayList<Integer>();

  @SerializedName("system_id")
  private Integer systemId = null;

  public GetUniverseSystemsSystemIdOk constellationId(Integer constellationId) {
    this.constellationId = constellationId;
    return this;
  }

   /**
   * The constellation this solar system is in
   * @return constellationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The constellation this solar system is in")
  public Integer getConstellationId() {
    return constellationId;
  }

  public void setConstellationId(Integer constellationId) {
    this.constellationId = constellationId;
  }

  public GetUniverseSystemsSystemIdOk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetUniverseSystemsSystemIdOk planets(List<GetUniverseSystemsSystemIdPlanet> planets) {
    this.planets = planets;
    return this;
  }

  public GetUniverseSystemsSystemIdOk addPlanetsItem(GetUniverseSystemsSystemIdPlanet planetsItem) {
    this.planets.add(planetsItem);
    return this;
  }

   /**
   * planets array
   * @return planets
  **/
  @ApiModelProperty(example = "null", required = true, value = "planets array")
  public List<GetUniverseSystemsSystemIdPlanet> getPlanets() {
    return planets;
  }

  public void setPlanets(List<GetUniverseSystemsSystemIdPlanet> planets) {
    this.planets = planets;
  }

  public GetUniverseSystemsSystemIdOk position(GetUniverseSystemsSystemIdPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetUniverseSystemsSystemIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseSystemsSystemIdPosition position) {
    this.position = position;
  }

  public GetUniverseSystemsSystemIdOk securityClass(String securityClass) {
    this.securityClass = securityClass;
    return this;
  }

   /**
   * security_class string
   * @return securityClass
  **/
  @ApiModelProperty(example = "null", value = "security_class string")
  public String getSecurityClass() {
    return securityClass;
  }

  public void setSecurityClass(String securityClass) {
    this.securityClass = securityClass;
  }

  public GetUniverseSystemsSystemIdOk securityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
    return this;
  }

   /**
   * security_status number
   * @return securityStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "security_status number")
  public Float getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
  }

  public GetUniverseSystemsSystemIdOk stargates(List<Integer> stargates) {
    this.stargates = stargates;
    return this;
  }

  public GetUniverseSystemsSystemIdOk addStargatesItem(Integer stargatesItem) {
    this.stargates.add(stargatesItem);
    return this;
  }

   /**
   * stargates array
   * @return stargates
  **/
  @ApiModelProperty(example = "null", required = true, value = "stargates array")
  public List<Integer> getStargates() {
    return stargates;
  }

  public void setStargates(List<Integer> stargates) {
    this.stargates = stargates;
  }

  public GetUniverseSystemsSystemIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * system_id integer
   * @return systemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "system_id integer")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemsSystemIdOk getUniverseSystemsSystemIdOk = (GetUniverseSystemsSystemIdOk) o;
    return Objects.equals(this.constellationId, getUniverseSystemsSystemIdOk.constellationId) &&
        Objects.equals(this.name, getUniverseSystemsSystemIdOk.name) &&
        Objects.equals(this.planets, getUniverseSystemsSystemIdOk.planets) &&
        Objects.equals(this.position, getUniverseSystemsSystemIdOk.position) &&
        Objects.equals(this.securityClass, getUniverseSystemsSystemIdOk.securityClass) &&
        Objects.equals(this.securityStatus, getUniverseSystemsSystemIdOk.securityStatus) &&
        Objects.equals(this.stargates, getUniverseSystemsSystemIdOk.stargates) &&
        Objects.equals(this.systemId, getUniverseSystemsSystemIdOk.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constellationId, name, planets, position, securityClass, securityStatus, stargates, systemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemsSystemIdOk {\n");
    
    sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    planets: ").append(toIndentedString(planets)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    securityClass: ").append(toIndentedString(securityClass)).append("\n");
    sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
    sb.append("    stargates: ").append(toIndentedString(stargates)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

