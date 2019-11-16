package com.api.javademo.model;

import java.util.Objects;
import org.springframework.format.annotation.*;
import com.api.javademo.model.Account;
import com.api.javademo.model.Transaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Statement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-26T16:12:13.568+05:30")

public class Statement   {
  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("transaction")
  private List<Transaction> transaction = null;

  public Statement account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Statement transaction(List<Transaction> transaction) {
    this.transaction = transaction;
    return this;
  }

  public Statement addTransactionItem(Transaction transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<Transaction>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Transaction> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<Transaction> transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.account, statement.account) &&
        Objects.equals(this.transaction, statement.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

