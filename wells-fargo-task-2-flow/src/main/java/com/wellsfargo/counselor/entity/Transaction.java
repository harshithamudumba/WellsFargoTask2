package com.wellsfargo.counselor.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue()
    private long TransactionId;

    @GeneratedValue()
    private long SecurityId;

    @Column(nullable = false)
    private String TransactionDate;

    @Column(nullable = false)
    private String TransactionType;

    @Column(nullable = false)
    private String Quantity;

    @Column(nullable = false)
    private String Price;

    protected Transaction() {

    }

    public Transaction(String TransactionDate, String TransactionType, String Quantity, String Price) {
        this.TransactionDate = TransactionDate;
        this.TransactionType = TransactionType;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public Long getTransactionId() {
        return TransactionId;
    }
    public Long getSecurityId() {
        return SecurityId;
    }

    public String getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(String TransactionDate) {
        this.TransactionDate = TransactionDate;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setLastName(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

}
