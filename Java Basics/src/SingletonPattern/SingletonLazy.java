package SingletonPattern;

public class SingletonLazy {
    private SingletonLazy()
    {
        System.out.println("Inside the Constructor ");
    }
    private static class Holder
    {
        private static final SingletonLazy INSTANCE = new SingletonLazy();

    }
    public static SingletonLazy getInstance()
    {
        return Holder.INSTANCE;
    }
    public static void main(String[] args) {
        Thread T1 = new Thread( () ->{ SingletonLazy.getInstance();});
        Thread T2 = new Thread( () ->{ SingletonLazy.getInstance();});
        
        T1.start();
        T2.start();


    }
}
