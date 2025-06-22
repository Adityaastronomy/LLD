package ProxyPattern;

public class RemoteProxy implements ICar {
    private RCScorpio scorpio = new RCScorpio();
    @Override
    public void turnLeft() {
        System.out.println("I am inside turn Left in Remote Class ");
        scorpio.turnLeft();
    }
    @Override
    public void turnRight() {
        System.out.println("I am inside turn Right in Remote Class ");
        scorpio.turnRight();
    }
    @Override
    public void goStraight() {
        System.out.println("I am inside go Straight in Remote Class ");
        scorpio.goStraight();
    }
}
