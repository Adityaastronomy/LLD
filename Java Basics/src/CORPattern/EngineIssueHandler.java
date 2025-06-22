package CORPattern;

public class EngineIssueHandler extends AbstractHandler {
    private int code = 300;
    
    public EngineIssueHandler( AbstractHandler nextHandler )
    {
        super( nextHandler );
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if( request.getRequestCode() == code )
        {
            System.out.println("Engine Handler is Handling the request ");
        }
        else
        {
            super.handleRequest(request);
        }
    }
}   
