package VisitorPattern;

public class Scorpio implements ICar{
    // VIMP
    @Override
    public void accept(ICarVisitor carVisitor) {
        System.out.println("Inside the Scorpio Accept Method ");
        carVisitor.visitScorpio( this );
    }
}
