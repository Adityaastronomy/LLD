
class Account : public Person
{
    private:
    string accountID;
    string password;
    AccountStatus status;
    VehicleReservation v;

    public:
    virtual bool resetPassword() = 0; 
};

class Receptionist : public Account
{
    private:
    time_t dateJoined;
    public:
    vector< Customer > searchCustomer( string name );
    bool addService();
    bool cancelService();
    bool resetPassword()
    {
        // implement
    }
};

class Customer : public Person
{
    string licenseNumber;
    time_t licenseExpiry;
    

    public:
    vector< Customer > searchCustomer( string name );
    bool addReservation();
    bool cancelReservation();
    bool resetPassword()
    {
        // implement
    }
};
