class Notification
{
    private:
    int notificationID;
    time_t createdOn;
    string content;
    public:
    void sendNotification( Account account ) = 0;
};
class SmsNotification : public Notification 
{
    public:
    void sendNotification( Account account )
    {
        // implement;
    }
};
class EmailNotification : public Notification
{
    public:
    void sendNotification( Account account )
    {
        // implement;
    }
};
