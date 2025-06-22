

public class execption {


    public static void printName( String name )  throws Exception
    {
        // int a = 10/0;
        if( name.equalsIgnoreCase("Adityaastronomy")  )
        {
            throw new NullPointerException();
        }
        System.out.println(name );
    }
    public static void main( String[] args)
    {
        try
        {
            printName("Adityaastronomy");
        }
        catch( Exception e )
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("All is Well");
        }





        // int a = 5 / 0;
        // int arr[] = new int[ 5 ];
        // System.out.println( arr[ 8 ]);
        // Try - Catch 
        
        // System.out.println( "Before Process is going on");
        // try
        // {

        //     int a = 5/0;
        //     int arr[ ] = { 10 , 20 };
        //     arr[ 10 ] = 10;
        // }
        // catch( ArrayIndexOutOfBoundsException | ArithmeticException e )
        // {
        //     System.out.println( e.getMessage());
        //     System.out.println("We are Handling some exception here ");
        // }
        // finally
        // {
        //     System.out.println("Mai toh Execute ho ke hi rahunga ");
        // }
        // // catch( ArithmeticException err )
        // // {
        // //     System.out.println( err.getMessage());
        // //     System.out.println("We are Handling some exception here ");
        // // }


    }
    
}
