#include<iostream>

using namespace std;

class Command
{
    public :
    virtual void execute() = 0;
    // destructor 
};
class BreakMechanism 
{
    public:
    void applyBreak()
    {
        cout<<"Break Mechanism applied to the Vehicle \n";
    }
};
class AirMechanism
{
    public:
    void liftVehicle()
    {
        cout<<"Lifting Mechanism applied to the vehicle \n";
    }
};

class AirCommand : public Command
{
    private :
    AirMechanism * airMechanism;
    public :
    AirCommand(AirMechanism * airMechanism)
    {
        this->airMechanism = airMechanism;
    }
    void execute()
    {
        airMechanism->liftVehicle();
    }

};
class BreakCommand: public Command
{
    private :
    BreakMechanism * breakMechanism;
    public:
    BreakCommand( BreakMechanism * breakMechanism )
    {
        this->breakMechanism = breakMechanism;
    }

    void execute()
    {
        breakMechanism->applyBreak();
    }
};
class Pannel
{
    private:
    Command* commands[ 5 ];
    public:
    Pannel()
    {}

    void setCommand( int index, Command * cmd )
    {
        commands[ index ] = cmd;
    }

    void liftVehicle()
    {
        commands[0]->execute();
    }
    void applyBreak()
    {
        commands[ 1 ]->execute();
    }
};

int main()
{
    // Setting Up
    BreakMechanism * breakMechanism = new BreakMechanism();
    AirMechanism * airMechanism = new AirMechanism();

    BreakCommand * breakCmd = new BreakCommand( breakMechanism );
    AirCommand * airCmd = new AirCommand( airMechanism );


    Pannel panel;
    panel.setCommand( 0 , airCmd );
    panel.setCommand( 1 , breakCmd );

    // try different buttons
    panel.applyBreak();
    panel.liftVehicle();
    return 0;
}
