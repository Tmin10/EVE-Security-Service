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
import ru.tmin10.EVESecurityService.serverApi.model.GetKillmailsKillmailIdKillmailHashItem;

/**
 * item object
 */
@ApiModel(description = "item object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-11T18:18:08.749+04:00")
public class GetKillmailsKillmailIdKillmailHashItem1 {
  @SerializedName("flag")
  private Integer flag = null;

  @SerializedName("item_type_id")
  private Integer itemTypeId = null;

  @SerializedName("items")
  private List<GetKillmailsKillmailIdKillmailHashItem> items = new ArrayList<GetKillmailsKillmailIdKillmailHashItem>();

  @SerializedName("quantity_destroyed")
  private Long quantityDestroyed = null;

  @SerializedName("quantity_dropped")
  private Long quantityDropped = null;

  @SerializedName("singleton")
  private Integer singleton = null;

  public GetKillmailsKillmailIdKillmailHashItem1 flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Flag for the location of the item 
   * @return flag
  **/
  @ApiModelProperty(example = "null", required = true, value = "Flag for the location of the item ")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public GetKillmailsKillmailIdKillmailHashItem1 itemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
    return this;
  }

   /**
   * item_type_id integer
   * @return itemTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "item_type_id integer")
  public Integer getItemTypeId() {
    return itemTypeId;
  }

  public void setItemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
  }

  public GetKillmailsKillmailIdKillmailHashItem1 items(List<GetKillmailsKillmailIdKillmailHashItem> items) {
    this.items = items;
    return this;
  }

  public GetKillmailsKillmailIdKillmailHashItem1 addItemsItem(GetKillmailsKillmailIdKillmailHashItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items array
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "items array")
  public List<GetKillmailsKillmailIdKillmailHashItem> getItems() {
    return items;
  }

  public void setItems(List<GetKillmailsKillmailIdKillmailHashItem> items) {
    this.items = items;
  }

  public GetKillmailsKillmailIdKillmailHashItem1 quantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
    return this;
  }

   /**
   * How many of the item were destroyed if any 
   * @return quantityDestroyed
  **/
  @ApiModelProperty(example = "null", value = "How many of the item were destroyed if any ")
  public Long getQuantityDestroyed() {
    return quantityDestroyed;
  }

  public void setQuantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
  }

  public GetKillmailsKillmailIdKillmailHashItem1 quantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
    return this;
  }

   /**
   * How many of the item were dropped if any 
   * @return quantityDropped
  **/
  @ApiModelProperty(example = "null", value = "How many of the item were dropped if any ")
  public Long getQuantityDropped() {
    return quantityDropped;
  }

  public void setQuantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
  }

  public GetKillmailsKillmailIdKillmailHashItem1 singleton(Integer singleton) {
    this.singleton = singleton;
    return this;
  }

   /**
   * singleton integer
   * @return singleton
  **/
  @ApiModelProperty(example = "null", required = true, value = "singleton integer")
  public Integer getSingleton() {
    return singleton;
  }

  public void setSingleton(Integer singleton) {
    this.singleton = singleton;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashItem1 getKillmailsKillmailIdKillmailHashItem1 = (GetKillmailsKillmailIdKillmailHashItem1) o;
    return Objects.equals(this.flag, getKillmailsKillmailIdKillmailHashItem1.flag) &&
        Objects.equals(this.itemTypeId, getKillmailsKillmailIdKillmailHashItem1.itemTypeId) &&
        Objects.equals(this.items, getKillmailsKillmailIdKillmailHashItem1.items) &&
        Objects.equals(this.quantityDestroyed, getKillmailsKillmailIdKillmailHashItem1.quantityDestroyed) &&
        Objects.equals(this.quantityDropped, getKillmailsKillmailIdKillmailHashItem1.quantityDropped) &&
        Objects.equals(this.singleton, getKillmailsKillmailIdKillmailHashItem1.singleton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, itemTypeId, items, quantityDestroyed, quantityDropped, singleton);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashItem1 {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
    sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
    sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
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

