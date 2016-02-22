package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-31T04:37:03.640Z")
public class Inventory   {
  
  private String inventoryCode = null;
  private String name = null;
  private Long itemPrice = null;

  
  /**
   * inventory code
   **/
  
  @ApiModelProperty(value = "inventory code")
  @JsonProperty("inventory-code")
  public String getInventoryCode() {
    return inventoryCode;
  }
  public void setInventoryCode(String inventoryCode) {
    this.inventoryCode = inventoryCode;
  }

  
  /**
   * name of the item
   **/
  
  @ApiModelProperty(value = "name of the item")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("item-price")
  public Long getItemPrice() {
    return itemPrice;
  }
  public void setItemPrice(Long itemPrice) {
    this.itemPrice = itemPrice;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventory inventory = (Inventory) o;
    return Objects.equals(inventoryCode, inventory.inventoryCode) &&
        Objects.equals(name, inventory.name) &&
        Objects.equals(itemPrice, inventory.itemPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryCode, name, itemPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inventory {\n");
    
    sb.append("    inventoryCode: ").append(toIndentedString(inventoryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

