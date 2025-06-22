package CORPattern;

public class Main {
    public static void main(String[] args) {
        // Sabse phele chain create kardo
        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        AbstractHandler enginerIssueHandler = new EngineIssueHandler(pressureHandler);

        // Request ready karlo
        PressureIssueRequest PressureIssueRequest = new PressureIssueRequest();
        enginerIssueHandler.handleRequest( PressureIssueRequest );
    }
}
