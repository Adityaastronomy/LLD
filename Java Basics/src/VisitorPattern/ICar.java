package VisitorPattern;

public interface ICar {
    // This is Versy Important in POV of the Double Dispatch Model
    public void accept( ICarVisitor carVisitor );

}
