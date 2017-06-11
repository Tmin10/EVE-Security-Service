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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetCharactersCharacterIdOk {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("ancestry_id")
  private Integer ancestryId = null;

  @SerializedName("birthday")
  private DateTime birthday = null;

  @SerializedName("bloodline_id")
  private Integer bloodlineId = null;

  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("description")
  private String description = null;

  /**
   * gender string
   */
  public enum GenderEnum {
    @SerializedName("female")
    FEMALE("female"),
    
    @SerializedName("male")
    MALE("male");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("gender")
  private GenderEnum gender = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("race_id")
  private Integer raceId = null;

  @SerializedName("security_status")
  private Float securityStatus = null;

  public GetCharactersCharacterIdOk allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * The character's alliance ID
   * @return allianceId
  **/
  @ApiModelProperty(example = "null", value = "The character's alliance ID")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetCharactersCharacterIdOk ancestryId(Integer ancestryId) {
    this.ancestryId = ancestryId;
    return this;
  }

   /**
   * ancestry_id integer
   * @return ancestryId
  **/
  @ApiModelProperty(example = "null", value = "ancestry_id integer")
  public Integer getAncestryId() {
    return ancestryId;
  }

  public void setAncestryId(Integer ancestryId) {
    this.ancestryId = ancestryId;
  }

  public GetCharactersCharacterIdOk birthday(DateTime birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Creation date of the character
   * @return birthday
  **/
  @ApiModelProperty(example = "null", required = true, value = "Creation date of the character")
  public DateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(DateTime birthday) {
    this.birthday = birthday;
  }

  public GetCharactersCharacterIdOk bloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
    return this;
  }

   /**
   * bloodline_id integer
   * @return bloodlineId
  **/
  @ApiModelProperty(example = "null", required = true, value = "bloodline_id integer")
  public Integer getBloodlineId() {
    return bloodlineId;
  }

  public void setBloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
  }

  public GetCharactersCharacterIdOk corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * The character's corporation ID
   * @return corporationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The character's corporation ID")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetCharactersCharacterIdOk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCharactersCharacterIdOk gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * gender string
   * @return gender
  **/
  @ApiModelProperty(example = "null", required = true, value = "gender string")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public GetCharactersCharacterIdOk name(String name) {
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

  public GetCharactersCharacterIdOk raceId(Integer raceId) {
    this.raceId = raceId;
    return this;
  }

   /**
   * race_id integer
   * @return raceId
  **/
  @ApiModelProperty(example = "null", required = true, value = "race_id integer")
  public Integer getRaceId() {
    return raceId;
  }

  public void setRaceId(Integer raceId) {
    this.raceId = raceId;
  }

  public GetCharactersCharacterIdOk securityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
    return this;
  }

   /**
   * security_status number
   * minimum: -10
   * maximum: 10
   * @return securityStatus
  **/
  @ApiModelProperty(example = "null", value = "security_status number")
  public Float getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdOk getCharactersCharacterIdOk = (GetCharactersCharacterIdOk) o;
    return Objects.equals(this.allianceId, getCharactersCharacterIdOk.allianceId) &&
        Objects.equals(this.ancestryId, getCharactersCharacterIdOk.ancestryId) &&
        Objects.equals(this.birthday, getCharactersCharacterIdOk.birthday) &&
        Objects.equals(this.bloodlineId, getCharactersCharacterIdOk.bloodlineId) &&
        Objects.equals(this.corporationId, getCharactersCharacterIdOk.corporationId) &&
        Objects.equals(this.description, getCharactersCharacterIdOk.description) &&
        Objects.equals(this.gender, getCharactersCharacterIdOk.gender) &&
        Objects.equals(this.name, getCharactersCharacterIdOk.name) &&
        Objects.equals(this.raceId, getCharactersCharacterIdOk.raceId) &&
        Objects.equals(this.securityStatus, getCharactersCharacterIdOk.securityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, ancestryId, birthday, bloodlineId, corporationId, description, gender, name, raceId, securityStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdOk {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    ancestryId: ").append(toIndentedString(ancestryId)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
    sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
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

