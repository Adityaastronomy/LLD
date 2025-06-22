#if !defined(BIRD_H)
#define BIRD_H
#include<iostream>  
using namespace std;

class Bird
{
    public:
    virtual void eat() = 0;  // pure virtual funxtion
    virtual void fly() = 0;

    // classes that inherits this class has to implement the eat and fly functions because this is pure virtual function
};

class Eagle : public Bird
{
    public:
    void eat()
    {
        cout<<"Eagle is eating \n";
    }
    void fly()
    {
        cout<<"Eagle is flying \n";
    }
};
class Sparrow : public Bird 
{
    public:
    void eat()
    {
        cout<<"Sparrow is eating \n";
    }
    void fly()
    {
        cout<<"Sparrow is flying \n";

    }
};

class Pigeon : public Bird 
{
    public:
    void eat()
    {
        cout<<"Pigeon is eating \n";
    }
    void fly()
    {
        cout<<"Pigeon is flying \n";
    }
};
#endif // BIRD_H
