package SOLID;

public class OCP {
    public interface PaymentProcessor {

        public void pay( int order , String securityCode );
    }
    class DebitPaymentProcessor implements PaymentProcessor
    {   
        public void pay( int order , String securityString )
        {

        }   
    }
    class CreditPaymentProcessor implements PaymentProcessor
    {
        public void pay( int order , String securityString )
        {

        }
    }
    class UPIPaymentProcessor implements PaymentProcessor
    {
        public void pay( int order , String securityString )
        {
            
        }
    }
}
