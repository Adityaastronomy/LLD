#include<iostream>
#include<string>
using namespace std;
class Employee
{
    protected:
    string name ;
    int employeeId;

    public:
    Employee( string name , int eid )
    {
        this->name = name;
        this->employeeId = eid;
        cout<< __FUNCTION__ << endl;

    }
    void display() const
    {
        cout<<"Employee: "<< name << " id: "<< employeeId << endl;
    }
};
class ProjectMannager
{
    protected:
    string projectMannaged;
    public:
    ProjectMannager( string ProjectMannaged )
    {
        this->projectMannaged = ProjectMannaged;
    }
    void manageProject() const
    {
        cout<< "Project Manager managing project: "<< projectMannaged << endl;
    }
};
class TeamLead
{
    protected:
    int teamSize ;
    public:
    TeamLead( int size )
    {
        this->teamSize = size;
    }
    void leadTeam() const 
    {
        cout<< "Team Lead leading a team of size: "<< teamSize<< endl;
    }
};

class Developer : public Employee
{
    private:
    string programmingLanguage;

    public:
    Developer( string name , int eid , string lang ): Employee( name , eid )
    {
        this->programmingLanguage = lang;
    }

    void show() const
    {
        display();
        cout<<"Specialisation: Developer, programming language : "<< programmingLanguage<< endl;
    }
};

class TechLead: public Employee , public  TeamLead , public ProjectMannager
{
    public:
    TechLead( string name , int eid , string project , int size ) : Employee( name , eid ) , ProjectMannager( project ) , TeamLead( size )
    {

    }
    void displayInfo() const 
    {
        display();
        manageProject();
        leadTeam();
    }
};

// Base Class of Multi Level Inheritance

class HRManager : public Employee 
{
    public:
    HRManager( string name , int eid ): Employee( name , eid )
    {
        cout<< __FUNCTION__ << endl;

    }
    void handleHRDuties( ) const
    {   
        cout<<"HR Handling the Human Resources Duties "<< endl;
    }
};
// Derived Class of the Multi Level Inhritance
class HRDirector: public HRManager
{
    public:
    HRDirector( string name , int eid ) : HRManager( name , eid )
    {
        cout<< __FUNCTION__ << endl;
    }
    void manageHRDepartment()
    {
        cout<<"HR Director handling the Human Resource Department "<< endl;

    }
};

// Hierarchical Inheritance
class Executive : public Employee
{
    public:
    Executive( string name , int eid ) : Employee( name , eid )
    {
        cout<< __FUNCTION__ << endl;

    }
    void manageExecutiveDecision()
    {
        cout<<"Executive managing executive Decisions "<< endl;
    }
};
class CEO : public Executive
{
    public:
    CEO( string name , int eid ) : Executive( name , eid )
    {
        cout<< __FUNCTION__ << endl;

    }
    void leadCompany()
    {
        manageExecutiveDecision();
        cout<<"CEO leading the company "<<endl;
    }
};

int main()
{
    // single Inheritance
    // Developer dev("AJ Styles" , 420, "C++");
    // dev.show();

    // // Multiple Inheritance
    // TechLead techLead( "Hero" , 12 , "Project X" , 5 );
    // techLead.displayInfo();

    // Multi Level Inheritance
    // HRDirector hrDirector( "Rahul" , 12 );
    // hrDirector.handleHRDuties();

    // Hierarchical Inheitance
    CEO ceo( "Devil Lal" , 420 );
    ceo.leadCompany();
    return 0;
}
