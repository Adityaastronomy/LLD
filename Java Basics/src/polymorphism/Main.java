package polymorphism;

public class Main {
    public static void main(String[] args) {
        // Calculator c = new Calculator();
        // System.out.println(c.add( 3 , 5 ));
        // System.out.println( c.add(5.8, 7.9));
        // System.out.println( c.add(1, 2, 3));

        // System.out.println("yes");

        // Run time polymorphism

        // Circle c = new Circle();
        // c.draw();
        // Rect r = new Rect();
        // r.draw();

        // Circle c = new Circle();
        // doDrawingStuff(c);

        // Shape s = new Circle();
        // s.draw();

        // runtime polymorphism
        Rect r = new Rect();
        doDrawingStuff(r);

        Circle c = new Circle();
        doDrawingStuff(c);

        Shape s = new Shape();
        doDrawingStuff(s);
    }
    public static void doDrawingStuff( Shape s )
    {
        s.draw();
    }
}
