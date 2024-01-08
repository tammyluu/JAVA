package heritage.single_table;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminator", discriminatorType= DiscriminatorType.STRING)
public abstract class Payment1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPayment;
    private Double amount;
    public Date paymentDate = new Date();


    public Payment1() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setId(Long idPayment) {
        this.idPayment =idPayment;
    }

    public Long getIdPayment() {
        return idPayment;
    }

    @Override
    public String toString() {
        return "Payment" +
                " |idPayment=" + idPayment +
                "|amount=" + amount +
                "|paymentDate=" + paymentDate +
                '|';
    }
}
