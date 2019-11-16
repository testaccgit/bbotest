package com.api.javademo.model;

import java.util.Objects;
import org.springframework.format.annotation.*;
import com.api.javademo.model.Balance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-26T16:12:13.568+05:30")

public class Account   {
  @JsonProperty("bankId")
  private String bankId = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountAlias")
  private String accountAlias = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("IBAN")
  private String IBAN = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("infoTimeStamp")
  private String infoTimeStamp = null;

  @JsonProperty("interestRate")
  private BigDecimal interestRate = null;

  @JsonProperty("maturityDate")
  private String maturityDate = null;

  @JsonProperty("lastPaymentDate")
  private String lastPaymentDate = null;

  @JsonProperty("nextPaymentDate")
  private String nextPaymentDate = null;

  @JsonProperty("remainingInstallments")
  private BigDecimal remainingInstallments = null;

  @JsonProperty("balances")
  private List<Balance> balances = null;

  public Account bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

   /**
   * Get bankId
   * @return bankId
  **/
  @ApiModelProperty(value = "")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account accountAlias(String accountAlias) {
    this.accountAlias = accountAlias;
    return this;
  }

   /**
   * Get accountAlias
   * @return accountAlias
  **/
  @ApiModelProperty(value = "")


  public String getAccountAlias() {
    return accountAlias;
  }

  public void setAccountAlias(String accountAlias) {
    this.accountAlias = accountAlias;
  }

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Account IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

   /**
   * Get IBAN
   * @return IBAN
  **/
  @ApiModelProperty(value = "")


  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account infoTimeStamp(String infoTimeStamp) {
    this.infoTimeStamp = infoTimeStamp;
    return this;
  }

   /**
   * Get infoTimeStamp
   * @return infoTimeStamp
  **/
  @ApiModelProperty(value = "")


  public String getInfoTimeStamp() {
    return infoTimeStamp;
  }

  public void setInfoTimeStamp(String infoTimeStamp) {
    this.infoTimeStamp = infoTimeStamp;
  }

  public Account interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public Account maturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Get maturityDate
   * @return maturityDate
  **/
  @ApiModelProperty(value = "")


  public String getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
  }

  public Account lastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * Get lastPaymentDate
   * @return lastPaymentDate
  **/
  @ApiModelProperty(value = "")


  public String getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public Account nextPaymentDate(String nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

   /**
   * Get nextPaymentDate
   * @return nextPaymentDate
  **/
  @ApiModelProperty(value = "")


  public String getNextPaymentDate() {
    return nextPaymentDate;
  }

  public void setNextPaymentDate(String nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
  }

  public Account remainingInstallments(BigDecimal remainingInstallments) {
    this.remainingInstallments = remainingInstallments;
    return this;
  }

   /**
   * Get remainingInstallments
   * @return remainingInstallments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getRemainingInstallments() {
    return remainingInstallments;
  }

  public void setRemainingInstallments(BigDecimal remainingInstallments) {
    this.remainingInstallments = remainingInstallments;
  }

  public Account balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public Account addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<Balance>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.bankId, account.bankId) &&
        Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountAlias, account.accountAlias) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.IBAN, account.IBAN) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.infoTimeStamp, account.infoTimeStamp) &&
        Objects.equals(this.interestRate, account.interestRate) &&
        Objects.equals(this.maturityDate, account.maturityDate) &&
        Objects.equals(this.lastPaymentDate, account.lastPaymentDate) &&
        Objects.equals(this.nextPaymentDate, account.nextPaymentDate) &&
        Objects.equals(this.remainingInstallments, account.remainingInstallments) &&
        Objects.equals(this.balances, account.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankId, accountId, accountAlias, accountType, accountName, IBAN, currency, infoTimeStamp, interestRate, maturityDate, lastPaymentDate, nextPaymentDate, remainingInstallments, balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountAlias: ").append(toIndentedString(accountAlias)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    infoTimeStamp: ").append(toIndentedString(infoTimeStamp)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    remainingInstallments: ").append(toIndentedString(remainingInstallments)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

