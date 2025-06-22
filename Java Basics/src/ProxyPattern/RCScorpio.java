package ProxyPattern;

public class RCScorpio implements ICar{
    @Override
    public void turnLeft() {
        System.out.println("I am inside turn Left in Scorpio Class ");
    }
    @Override
    public void turnRight() {
        System.out.println("I am inside turn Right in Scorpio Class ");
    }
    @Override
    public void goStraight() {
        System.out.println("I am inside go Straight in Scorpio Class ");
    }
}
