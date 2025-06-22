class Service
{
    private:
    int serviceID;
    int price;

};

class DriverService : public Service 
{
    private:
    int driverId;
};

class RoadService : public Service
{

};
class WiFi : public Service
{

};
