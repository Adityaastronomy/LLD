package polymorphism;

public class Circle extends Shape{

    @Override
    public void draw()
    {
        // by deafult yaha pe override ho gya hai
        // and keyword is used just for readbility of the code
        
        System.out.println("Circle is drawing ");
    }
}
