#include<iostream>

using namespace std;

// Defining the Low level entities needed for making high level entity
class ILogger
{   
    public:
    virtual ~ILogger() = default;
    virtual void Log(string  message ) = 0;
};

class ConsoleLogger : public ILogger 
{
    public:
    void Log( string  message )
    {
        cout<< "Console Logger: "<< message << endl;
    }
};
class FileLogger : public ILogger 
{
    public:
    void Log( string  message )
    {
        cout<< "File Logger: "<< message << endl;
    }
};
// High Level Entity 
class Application
{
    private :
    ILogger* logger;
    public:
    Application( ILogger * logger_ )
    {
        this->logger = logger_;
    }
    void Process()
    {
        logger->Log("Application Process ");
    }
};
int main()
{
    FileLogger * flogger = new FileLogger();
    Application app( flogger );
    app.Process();
    return 0;
}
