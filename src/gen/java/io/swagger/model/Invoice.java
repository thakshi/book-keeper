package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Customer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-31T04:37:03.640Z")
public class Invoice   {
  
  private String invoiceNo = null;
  private String invoiceTable = null;
  private Customer customer = null;

  
  /**
   * invoice code
   **/
  
  @ApiModelProperty(value = "invoice code")
  @JsonProperty("invoice-no")
  public String getInvoiceNo() {
    return invoiceNo;
  }
  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  
  /**
   * data table related to inoice in json format
   **/
  
  @ApiModelProperty(value = "data table related to inoice in json format")
  @JsonProperty("invoice-table")
  public String getInvoiceTable() {
    return invoiceTable;
  }
  public void setInvoiceTable(String invoiceTable) {
    this.invoiceTable = invoiceTable;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customer")
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(invoiceNo, invoice.invoiceNo) &&
        Objects.equals(invoiceTable, invoice.invoiceTable) &&
        Objects.equals(customer, invoice.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNo, invoiceTable, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    invoiceTable: ").append(toIndentedString(invoiceTable)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

