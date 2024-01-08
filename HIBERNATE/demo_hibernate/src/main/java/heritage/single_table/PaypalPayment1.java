package heritage.single_table;


import javax.persistence.*;

@Entity
@DiscriminatorValue("PayPal")
public class PaypalPayment1 extends Payment1 {

    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "PaypalPayment|" +
                "| accountNumber='" + accountNumber + '\'' +
                "| " + super.toString();
    }


}
