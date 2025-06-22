package VisitorPattern;

public class DepPriceVisitor implements ICarVisitor {
    @Override
    public void visitAlto(Aulto aulto) {
        System.out.println("I am Visiting Dep Alto ");
    }
    @Override
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("I am Visiting Dep Scorpio ");

    }
}
