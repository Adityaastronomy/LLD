class Address
{
    private:
    string streetAdress;
    string city;
    string state;
    string country;
    int zipCode;

};
class Person
{
    private:
    string name;
    Address address;
    string email;
    int phoneNumber;
};
class Driver: public Person
{
    private:
    int diverID;
};
