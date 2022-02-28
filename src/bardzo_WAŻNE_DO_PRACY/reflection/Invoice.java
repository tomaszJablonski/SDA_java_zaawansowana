package bardzo_WAŻNE_DO_PRACY.reflection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Invoice {
    private LocalDateTime createdData;
    private BigDecimal amount;
    private String issuer;
    private String owner;
    private boolean paid;

    public Invoice(){

    }

    public Invoice(LocalDateTime createdData, BigDecimal amount, String issuer, String owenr, boolean paid) {
        this.createdData = createdData;
        this.amount = amount;
        this.issuer = issuer;
        this.owner = owenr;
        this.paid = paid;
    }


    @Deprecated(since = "hello world !!!!")
    public void setCreatedData(LocalDateTime createdData) {
        this.createdData = createdData;
    }

    public LocalDateTime getCreatedData() {
        return createdData;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "createdData=" + createdData +
                ", amount=" + amount +
                ", issuer='" + issuer + '\'' +
                ", owenr='" + owner + '\'' +
                ", paid=" + paid +
                '}';
    }
}
