package colourmyplate.data.rest.server.v1.model;

import java.util.Objects;
import colourmyplate.data.rest.server.v1.model.OrderDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SaleDAO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-23T12:19:40.042692600+03:00[Asia/Damascus]")

public class SaleDAO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("creation_date")
  private LocalDate creationDate;

  @JsonProperty("client")
  private String client;

  @JsonProperty("seller")
  private String seller;

  @JsonProperty("order")
  @Valid
  private List<OrderDetail> order = new ArrayList<>();

  @JsonProperty("total")
  private Float total;

  public SaleDAO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SaleDAO creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public SaleDAO client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public SaleDAO seller(String seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSeller() {
    return seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }

  public SaleDAO order(List<OrderDetail> order) {
    this.order = order;
    return this;
  }

  public SaleDAO addOrderItem(OrderDetail orderItem) {
    this.order.add(orderItem);
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<OrderDetail> getOrder() {
    return order;
  }

  public void setOrder(List<OrderDetail> order) {
    this.order = order;
  }

  public SaleDAO total(Float total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @ApiModelProperty(value = "")


  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleDAO saleDAO = (SaleDAO) o;
    return Objects.equals(this.id, saleDAO.id) &&
        Objects.equals(this.creationDate, saleDAO.creationDate) &&
        Objects.equals(this.client, saleDAO.client) &&
        Objects.equals(this.seller, saleDAO.seller) &&
        Objects.equals(this.order, saleDAO.order) &&
        Objects.equals(this.total, saleDAO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, client, seller, order, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleDAO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

