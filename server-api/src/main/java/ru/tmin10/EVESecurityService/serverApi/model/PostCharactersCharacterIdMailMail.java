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
import ru.tmin10.EVESecurityService.serverApi.model.PostCharactersCharacterIdMailRecipient;

/**
 * mail schema
 */
@ApiModel(description = "mail schema")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class PostCharactersCharacterIdMailMail {
  @SerializedName("approved_cost")
  private Long approvedCost = 0l;

  @SerializedName("body")
  private String body = null;

  @SerializedName("recipients")
  private List<PostCharactersCharacterIdMailRecipient> recipients = new ArrayList<PostCharactersCharacterIdMailRecipient>();

  @SerializedName("subject")
  private String subject = null;

  public PostCharactersCharacterIdMailMail approvedCost(Long approvedCost) {
    this.approvedCost = approvedCost;
    return this;
  }

   /**
   * approved_cost integer
   * @return approvedCost
  **/
  @ApiModelProperty(example = "null", value = "approved_cost integer")
  public Long getApprovedCost() {
    return approvedCost;
  }

  public void setApprovedCost(Long approvedCost) {
    this.approvedCost = approvedCost;
  }

  public PostCharactersCharacterIdMailMail body(String body) {
    this.body = body;
    return this;
  }

   /**
   * body string
   * @return body
  **/
  @ApiModelProperty(example = "null", required = true, value = "body string")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public PostCharactersCharacterIdMailMail recipients(List<PostCharactersCharacterIdMailRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PostCharactersCharacterIdMailMail addRecipientsItem(PostCharactersCharacterIdMailRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * recipients array
   * @return recipients
  **/
  @ApiModelProperty(example = "null", required = true, value = "recipients array")
  public List<PostCharactersCharacterIdMailRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<PostCharactersCharacterIdMailRecipient> recipients) {
    this.recipients = recipients;
  }

  public PostCharactersCharacterIdMailMail subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * subject string
   * @return subject
  **/
  @ApiModelProperty(example = "null", required = true, value = "subject string")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdMailMail postCharactersCharacterIdMailMail = (PostCharactersCharacterIdMailMail) o;
    return Objects.equals(this.approvedCost, postCharactersCharacterIdMailMail.approvedCost) &&
        Objects.equals(this.body, postCharactersCharacterIdMailMail.body) &&
        Objects.equals(this.recipients, postCharactersCharacterIdMailMail.recipients) &&
        Objects.equals(this.subject, postCharactersCharacterIdMailMail.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedCost, body, recipients, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdMailMail {\n");
    
    sb.append("    approvedCost: ").append(toIndentedString(approvedCost)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

