package com.wellsfargo.counselor.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long SecurityId;
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String PurchaseDate;

    @Column(nullable = false)
    private long PurchasePrice;

    protected Security() {

    }

    public Security(long PortfolioId,String firstName, String lastName, String PurchaseDate, long PurchasePrice) {
        this.PortfolioId=PortfolioId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.PurchaseDate = PurchaseDate;
        this.PurchasePrice = PurchasePrice;

    }

    public Long getSecurityrId() {
        return SecurityId;
    }

    public long getPortfolioId() {
        return PortfolioId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public long getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(long PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

}
