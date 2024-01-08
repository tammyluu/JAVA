import heritage.joined_table.CreditCardPayment;
import heritage.joined_table.PaypalPayment;
import heritage.single_table.CreditCardPayment1;
import heritage.single_table.PaypalPayment1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.getTransaction();
            tx.begin();
            // Exemple joined table :

           /* CreditCardPayment creditCardPayment = new CreditCardPayment();
            creditCardPayment.setCardNumber("178456");
            creditCardPayment.setAmount(4000.0);
            creditCardPayment.setPaymentDate(new Date());
            creditCardPayment.setExpirationDate("12/2026");


            PaypalPayment paypalPayment = new PaypalPayment();
            paypalPayment.setAccountNumber("45878");
            paypalPayment.setPaymentDate(new Date());
            paypalPayment.setAmount(10000.0);

            session.save(creditCardPayment);
            session.save(paypalPayment);


          */

            // single table

            CreditCardPayment1 creditCardPayment = new CreditCardPayment1();
            creditCardPayment.setCardNumber("123456");
            creditCardPayment.setPaymentDate(new Date());
            creditCardPayment.setExpirationDate("02/2025");
            creditCardPayment.setAmount(98214.10);

            PaypalPayment1 paypalPayment = new PaypalPayment1();
            paypalPayment.setAccountNumber("741852");
            paypalPayment.setPaymentDate(new Date());
            paypalPayment.setAmount(2560.0);
            session.save(creditCardPayment);
            session.save(paypalPayment);

            tx.commit();
            System.out.println("creditCardPayment " + creditCardPayment);
            System.out.println("paypalPayment " + paypalPayment);

        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        } finally {
            session.close();
            sessionFactory.close();
        }


    }
}