class Account
{
    private:
        string accountId;
        string pasword;
        string username;
        string email;
        AccountStatus status;

    public:
        bool resetPassword();

};