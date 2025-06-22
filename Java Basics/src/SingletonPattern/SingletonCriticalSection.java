package SingletonPattern;

public class SingletonCriticalSection {
    public static SingletonCriticalSection instance;
    private SingletonCriticalSection()
    {
        System.out.println("Constructor ke andar hun");
    }
    public static SingletonCriticalSection getInstance()
    {
        if( instance == null )
        {
            instance = new SingletonCriticalSection();
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread T1 = new Thread(  () ->{ SingletonCriticalSection.getInstance();});
        Thread T2 = new Thread(  () ->{ SingletonCriticalSection.getInstance();});
        T1.start();
        T2.start();
        
    }
}
