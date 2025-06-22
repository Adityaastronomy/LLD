package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);

        // gidance
        director.construct( false , true , false , true  );

        ICar car = builder.build();

    }
}
