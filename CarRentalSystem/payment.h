class Payment
{
    private:
    double amount;
    time_t timestamp;
    PaymentStatus status;

    public:
    virtual bool makePayment() = 0;
};
class Cash : public Payment
{
    public:
    bool makePayment()
    {
        // implement;
    }
};

class Card: public Payment
{
    string nameOnCard;
    string cardNumber;
    string billingAddress;
    int code;
    public:
    bool makePayment()
    {
        // implement
    }
};
 