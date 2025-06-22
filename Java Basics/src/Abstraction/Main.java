package Abstraction;

abstract class Bird
{
    abstract void fly();
    abstract void eat();
}
class Sparrow extends Bird 
{
    @Override
    void fly()
    {
        System.out.println("Sparrow is flying ");
    }
    @Override
    void eat()
    {
        System.out.println("Sparrow is eating ");
    }
}
class Crow extends Bird 
{
    @Override
    void fly()
    {
        System.out.println("Crow is flying ");
    }
    @Override
    void eat()
    {
        System.out.println("Crow is eating ");
    }
}
public class Main {

    public static void doBirdSomething( Bird b )
    {
        b.eat();
        b.fly();
        b.eat();
    }
    public static void main(String[] args) {
        // Bird b = new Sparrow();
        // b.eat();
        // b.fly();

        // Bird c = new Crow();
        // c.eat();
        // c.fly();


        doBirdSomething(new Crow());
        doBirdSomething(new Sparrow() );
    

    }
}
