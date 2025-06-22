package BuilderPattern;

public class Director {
    ICarBuilder carBuilder;

    public Director( ICarBuilder builder )
    {
        this.carBuilder = builder;
    }

    // instruction
    public void construct(boolean isTyre , boolean isEngine , boolean isChassis , boolean isBodyShell)
    {
        if( isEngine )
        {
            carBuilder.buildEngine();
        }
        if( isBodyShell )
        {
            carBuilder.buildBodyShell();
        }
        if( isChassis )
        {
            carBuilder.buildChassis();
        }
        
        if( isTyre )
        {
            carBuilder.buildTyre();

        }

    }
}
