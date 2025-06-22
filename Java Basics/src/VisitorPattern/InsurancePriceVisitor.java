package VisitorPattern;

public class InsurancePriceVisitor implements ICarVisitor
{
    // Multiple Visit function specific to car type present below
    @Override
    public void visitAlto(Aulto aulto) {
        System.out.println("I am Visiting Insurance Alto ");
    }
    @Override
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("I am Visiting Insurance Scorpio ");

    }
}
