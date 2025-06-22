#include<iostream>

using namespace std;
class Student
{
    private:
    
    float *gpa;
    string gf;

    int id;
    int nos;
    string name;
    int age ;

    public:

    void setGpa( float g )
    {
        *this->gpa = g;
    }

    float getGpa() const
    {
        return *this->gpa;
    }


    // Default Constructor 
    Student()
    {
        cout<<"Default Constructor is called \n";
    }
    // Parameterised Constructor 
    Student( int id , int age , int nos , string name , float gpa , string gf)
    {
        cout<<"Parameterized Constructor is called \n";
        this->name = name;
        this->age = age;
        this->id = id;
        this->nos  = nos;
        this->gf = gf;
        this->gpa = new float( gpa );

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
    private :
    void gfchatting()
    {
        cout<< this->name << " chatting to his gf \n";
    }
};
int main()
{
    Student A ( 1 , 22 , 5 , "Tinku Ji" , 7.8 , "Binno");
    // cout<< A.id;
    
    return 0;
}
