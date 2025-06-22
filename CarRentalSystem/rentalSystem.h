#include <iostream>
#include <string>
#include <vector>
#include "branch.h"

class CarRentalSystem
{
    private:
    string name;
    vector< CarRentalBranch > branches;

    // Singleton class
    CarRentalSystem()
    {

    }
    static CarRentalSystem system = NULL;
    public:

    void addNewBranch( CarRentalBranch branch );
    static CarRentalSystem getInstance()
    {
        if( system == NULL )
        {
            system = new CarRentalSystem();
        }
        return system;
    }

};
