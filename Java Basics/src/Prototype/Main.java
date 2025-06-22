package Prototype;

// import PatternOne.ScorpioClassic;

public class Main {
    public static void main(String[] args) 
    {
        // Sabse phele prototype 
        IScorpioPrototype prototype = new Scorpio();

        // create a Scorpio N
        IScorpioPrototype ScorpioNCar = prototype.clone();
        ScorpioNCar.setEngine( new ScorpioNEngine());

        // create a Scorpio Classic
        IScorpioPrototype ScorpioClassicCar = prototype.clone();
        ScorpioClassicCar.setEngine( new ScorpioClassicEngine());
    }
    

}
