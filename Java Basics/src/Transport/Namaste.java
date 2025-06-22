import java.util.Scanner;

public class Namaste {
    public static void display( )
    {
        System.out.println("Aditya Kumar");
    }

    public static int getSum( int a , int b )
    {
        return ( a + b );
    }
    public static void main( String[] args)
    {
        // System.out.println("Namaste Duniya");
        // Scanner input = new Scanner( System.in );
        // System.out.println("Enter you Name to print :");

        // String str = input.nextLine() ;
        // System.out.println("Name " + str);
        
        // input.close();

        // int arr[] = { 10 , 20 , 30 , 40 };
        // for( int i : arr )
        // {
        //     System.out.println(i);

        // }

        // display();

        // System.out.println( getSum(10, 20));


        // String str = "Aditya Kumar";
        // System.out.println( str );
        // // System.out.println( str[ 0 ] );
        // // str[ 1 ] = 'b';
        // str = "Honey";
        // System.out.println( str );
        
        String str1 = "Aditya";
        String str2 = "aditya";
        String name = str1.replace( 'a' , 'b');
        System.out.println( name );
        // System.out.println( str1.charAt(3));
        // System.out.println( str1.equals( str2 ) );
        // System.out.println( str1.equalsIgnoreCase( str2 ) );
        // System.out.println( str1 == str2  );
    }   
}
