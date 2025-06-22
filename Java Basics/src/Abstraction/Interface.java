package Abstraction;

interface Chidya {

    void eat();
    void fly();
}
class Pigeon implements Chidya 
{
    @Override
    public void eat()
    {
        System.out.println("Pigeon is eating ");
    }
    @Override
    public void fly()
    {
        System.out.println("Pigeon is flying");
    }
}
 interface Walk {
    void walking();
    
}
class Hawk implements Walk , Chidya 
{
    public void walking()
    {
        System.out.println("We are waling ");
    }
    public void eat()
    {
        System.out.println("Eating");
    }
    public void fly()
    {
        System.out.println("Flying");
    }
}
public class Interface {
    public static void main(String[] args) {
        // Chidya  c = new Pigeon();
        // c.fly();
        // c.eat();
    }
}
