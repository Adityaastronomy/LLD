#include<iostream>

using namespace std;
class Singleton
{
    private :
    Singleton()
    {
        cout<<"Creating an Object \n";
    }
    // koi coopy constructor nhi bana pai
    Singleton( Singleton const & ) = delete;
    Singleton& operator =( Singleton const & ) = delete;

    public:
    static Singleton & getInstance()
    {
        
        
        static Singleton instance; // using stack memory in cpp not like in Java using Heap memory
        // gauranteed to be destroy and instantionated on complete of utility

        return instance;
    }
};
int main()
{
    Singleton& instance1 = Singleton::getInstance();
    Singleton& instance2 = Singleton::getInstance();
    cout<< &instance1<< endl;
    cout<< &instance2<< endl;
    
    return 0;
}
