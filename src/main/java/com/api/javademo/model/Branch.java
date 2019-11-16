package com.api.javademo.model;

import java.util.Objects;
import org.springframework.format.annotation.*;
import com.api.javademo.model.BranchAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Branch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-26T16:12:13.568+05:30")

public class Branch   {
  @JsonProperty("branchName")
  private String branchName = null;

  @JsonProperty("atmAvailabilityFlag")
  private Boolean atmAvailabilityFlag = null;

  @JsonProperty("atmBNA")
  private Boolean atmBNA = null;

  @JsonProperty("coinMachineAvailabilityFlag")
  private Boolean coinMachineAvailabilityFlag = null;

  @JsonProperty("address")
  private BranchAddress address = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("latitude")
  private Integer latitude = null;

  @JsonProperty("longitude")
  private Integer longitude = null;

  @JsonProperty("branchType")
  private String branchType = null;

  public Branch branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

   /**
   * Get branchName
   * @return branchName
  **/
  @ApiModelProperty(value = "")


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public Branch atmAvailabilityFlag(Boolean atmAvailabilityFlag) {
    this.atmAvailabilityFlag = atmAvailabilityFlag;
    return this;
  }

   /**
   * Get atmAvailabilityFlag
   * @return atmAvailabilityFlag
  **/
  @ApiModelProperty(value = "")


  public Boolean getAtmAvailabilityFlag() {
    return atmAvailabilityFlag;
  }

  public void setAtmAvailabilityFlag(Boolean atmAvailabilityFlag) {
    this.atmAvailabilityFlag = atmAvailabilityFlag;
  }

  public Branch atmBNA(Boolean atmBNA) {
    this.atmBNA = atmBNA;
    return this;
  }

   /**
   * Get atmBNA
   * @return atmBNA
  **/
  @ApiModelProperty(value = "")


  public Boolean getAtmBNA() {
    return atmBNA;
  }

  public void setAtmBNA(Boolean atmBNA) {
    this.atmBNA = atmBNA;
  }

  public Branch coinMachineAvailabilityFlag(Boolean coinMachineAvailabilityFlag) {
    this.coinMachineAvailabilityFlag = coinMachineAvailabilityFlag;
    return this;
  }

   /**
   * Get coinMachineAvailabilityFlag
   * @return coinMachineAvailabilityFlag
  **/
  @ApiModelProperty(value = "")


  public Boolean getCoinMachineAvailabilityFlag() {
    return coinMachineAvailabilityFlag;
  }

  public void setCoinMachineAvailabilityFlag(Boolean coinMachineAvailabilityFlag) {
    this.coinMachineAvailabilityFlag = coinMachineAvailabilityFlag;
  }

  public Branch address(BranchAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BranchAddress getAddress() {
    return address;
  }

  public void setAddress(BranchAddress address) {
    this.address = address;
  }

  public Branch telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Branch fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Branch latitude(Integer latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public Branch longitude(Integer longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public Branch branchType(String branchType) {
    this.branchType = branchType;
    return this;
  }

   /**
   * Get branchType
   * @return branchType
  **/
  @ApiModelProperty(value = "")


  public String getBranchType() {
    return branchType;
  }

  public void setBranchType(String branchType) {
    this.branchType = branchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.branchName, branch.branchName) &&
        Objects.equals(this.atmAvailabilityFlag, branch.atmAvailabilityFlag) &&
        Objects.equals(this.atmBNA, branch.atmBNA) &&
        Objects.equals(this.coinMachineAvailabilityFlag, branch.coinMachineAvailabilityFlag) &&
        Objects.equals(this.address, branch.address) &&
        Objects.equals(this.telephone, branch.telephone) &&
        Objects.equals(this.fax, branch.fax) &&
        Objects.equals(this.latitude, branch.latitude) &&
        Objects.equals(this.longitude, branch.longitude) &&
        Objects.equals(this.branchType, branch.branchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, atmAvailabilityFlag, atmBNA, coinMachineAvailabilityFlag, address, telephone, fax, latitude, longitude, branchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    atmAvailabilityFlag: ").append(toIndentedString(atmAvailabilityFlag)).append("\n");
    sb.append("    atmBNA: ").append(toIndentedString(atmBNA)).append("\n");
    sb.append("    coinMachineAvailabilityFlag: ").append(toIndentedString(coinMachineAvailabilityFlag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    branchType: ").append(toIndentedString(branchType)).append("\n");
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

