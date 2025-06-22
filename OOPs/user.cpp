#include<iostream>

using namespace std;
class UserInfo
{
    public :
    void addUser( string name )
    {
        // user add code
    }
    
    
};
class Logger 
{
    public :
    void logError( string error )
    {
        // log error
    }
};
// SRP example
class ContentManager
{
    public:
    void addContent( string contentID )
    {
        // db add
    }
    void removeContent( string contentID )
    {
        // db delete

    }   
    string getContent(string contentID )
    {
        
    }
    
};
class ContentRenderar
{
    public:
    string renderContentAsHTML( string contentID )
    {
        ContentManager c ;
        c.getContent("Hero");

        // html balance 
        
    }
    
};


int main()
{
    
    return 0;
}
