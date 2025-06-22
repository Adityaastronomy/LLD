
class VehicleLog 
{
    private :
    int logID;
    VehicleLogType type;
    string description;
    time_t creationDate;


};
class VehicleReservaion 
{
    private:
    int reservationID;
    string customerID;
    string vehicleID;
    time_t creationID;
    ReservationStatus status;
    time_t dueDate;
    time_t returnDate;
    string pickUpLocation;
    string dropOffLocation;


    vector< Equipments > equpments;
    vector< Service > services;
    public:
    static VehicleReservaion getReservationDetails();
    bool addEqipments();
    bool addServices();
};
