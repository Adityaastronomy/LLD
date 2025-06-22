class Vehicle
{
    private:
    int vehicleId;
    string licenseName;
    int passengerCapacity;
    bool hasSunRoof;
    VehicleStatus status;
    string model;
    int manufacturingYear;
    int mileage;
    vector< VehicleLog > log;

    public:
    bool reserveVehicle();
    bool returnVehicle();
    void getServiceDone();
};

class Car : public Vehicle 
{
    private :
    carType carType;
};

class Van : public Vehicle 
{
    private :
    VanType vanType;
};

class Truck : public Vehicle 
{
    private :
    TruckType truckType;
};

class MotorCycle : public Vehicle 
{
    private :
    MotorCycleType motorCycleType;
};
