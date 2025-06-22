#include<iostream>

using namespace std;

class AbstractRequest
{
    protected:
    int requestCode;
    public:
    AbstractRequest( int code )
    {
        this->requestCode = code;
    }

    int getRequestCode( )
    {
        return requestCode;
    }
};

class PressureIssueRequest : public AbstractRequest
{
    public:
    PressureIssueRequest( ) : AbstractRequest( 303 )
    {

    }

};
class EngineIssueRequest : public AbstractRequest
{
    public:
    EngineIssueRequest() : AbstractRequest( 300 )
    {

    }
};


// Handler 
class AbstractHandler
{
    protected : AbstractHandler * nextHandler;
    AbstractHandler( AbstractHandler *  next )
    {
        this->nextHandler = next;
    }
    public:
    virtual void handleRequest( AbstractRequest * request )
    {
        if( nextHandler != NULL )
        {
            nextHandler->handleRequest( request );
        }
    }
};

class PressureIssueHandler : public AbstractHandler
{
    static const int code = 303;
    public:
    PressureIssueHandler( AbstractHandler * succesor ) : AbstractHandler( succesor )
    {

    }
    

    void handleRequest( AbstractRequest* request )
    {
        if( request->getRequestCode() == code )
        {
            cout<< "Pressure Handler is Handling the Request \n";
        }
        else
        {
            AbstractHandler::handleRequest( request );
        }
    }

};
class EngineIssueHandler : public AbstractHandler
{
    static const int code = 300;
    public:
    EngineIssueHandler( AbstractHandler * succesor ) : AbstractHandler( succesor )
    {

    }

    void handleRequest( AbstractRequest * request )
    {
        if( request->getRequestCode() == code )
        {
            cout<< "Engine Handler is Handling the Request \n";
        }
        else
        {
            AbstractHandler::handleRequest( request );
        }
    }
};
int main()
{

    // Create Chain
    PressureIssueHandler * pressureIssueHandler = new PressureIssueHandler( NULL );
    EngineIssueHandler * engineIssueHandler = new EngineIssueHandler( pressureIssueHandler );

    // create request   
    PressureIssueRequest * pressureIssueRequest = new PressureIssueRequest( );
    EngineIssueRequest * engineIssueRequest = new EngineIssueRequest();

    // handle Request
    engineIssueHandler->handleRequest( pressureIssueRequest );
    engineIssueHandler->handleRequest( engineIssueRequest );

    // destructor 
    
    return 0;
}
