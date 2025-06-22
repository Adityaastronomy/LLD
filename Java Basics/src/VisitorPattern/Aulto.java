package VisitorPattern;

public class Aulto implements ICar{
    @Override
    public void accept(ICarVisitor carVisitor) {
        System.out.println("Inside the Aulto Accept Method ");
        carVisitor.visitAlto( this );
    }
}
