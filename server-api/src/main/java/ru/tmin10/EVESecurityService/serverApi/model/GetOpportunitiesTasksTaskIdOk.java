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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetOpportunitiesTasksTaskIdOk {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notification")
  private String notification = null;

  @SerializedName("task_id")
  private Integer taskId = null;

  public GetOpportunitiesTasksTaskIdOk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(example = "null", required = true, value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetOpportunitiesTasksTaskIdOk name(String name) {
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

  public GetOpportunitiesTasksTaskIdOk notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * notification string
   * @return notification
  **/
  @ApiModelProperty(example = "null", required = true, value = "notification string")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public GetOpportunitiesTasksTaskIdOk taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * task_id integer
   * @return taskId
  **/
  @ApiModelProperty(example = "null", required = true, value = "task_id integer")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOpportunitiesTasksTaskIdOk getOpportunitiesTasksTaskIdOk = (GetOpportunitiesTasksTaskIdOk) o;
    return Objects.equals(this.description, getOpportunitiesTasksTaskIdOk.description) &&
        Objects.equals(this.name, getOpportunitiesTasksTaskIdOk.name) &&
        Objects.equals(this.notification, getOpportunitiesTasksTaskIdOk.notification) &&
        Objects.equals(this.taskId, getOpportunitiesTasksTaskIdOk.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, notification, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOpportunitiesTasksTaskIdOk {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

