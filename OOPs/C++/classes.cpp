#include<iostream>

using namespace std;
class Student
{
    public:
    // Default Constructor 
    Student()
    {
        cout<<"Default Constructor is called \n";
    }
    // Parameterised Constructor 
    Student( int id , int age , int nos , string name )
    {
        cout<<"Parameterized Constructor is called \n";
        this->name = name;
        this->age = age;
        this->id = id;
        this->nos = nos;

    }
    // Copy Constructor 
    Student( const Student & B )
    {
        cout<<"Copy Constructor is called \n";
        this->name = B.name;
        this->age = B.age;
        this->id = B.id;
        this->nos = B.nos;

    }
    int id;
    int nos;
    string name;
    int age ;
    void bunk()
    {
        cout<< name << " is bunking the classes \n";
    }
    void eating()
    {
        cout<< name << " is eating \n";
    }
    void study()
    {
        cout<<name<<" is Studying\n";
    }
    ~Student()
    {
        cout<< name <<" Default destructor is called \n ";
    }
};

int main()
{
    // Student A;
    // A.id=1;
    // A.nos= 8 ;
    // A.name = "Aditya";
    // A.age = 20;

    // A.study();

    // Student B;
    // B.id=2;
    // B.nos= 9;
    // B.name = "Lund";
    // B.age = 21;
    // B.bunk();

    // Student B( 1 , 19 , 6 , "YoYo Honey Singh  ");

    // Student A( B );

    // Dynamic Allocation
    Student * s = new Student( 1 , 19 , 7 , "Heropanti");
    s->study();
    delete s;
    return 0;
}
