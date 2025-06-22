package FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        // int[][] location Tejas 
        Tejas plane = new Tejas();
        for( int i = 0 ; i < 5 ; i++ )
        {
            int srcx = 5;
            int srcy = 10;
            int desx = 10;
            int desy = 12;
            int speed = 10;
            double time = plane.getTotalTimeToReachDest(srcx, srcy, desx, desy, speed);
            System.out.println("Time : " + time );
        }
    }
}
