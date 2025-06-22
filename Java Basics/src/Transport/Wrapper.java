public class Wrapper {
    public static void main( String[] args )
    {
        // int num = 5;
        // Integer n = Integer.valueOf(num);
        // System.out.println(n);

        Integer num = 5;
        if( num instanceof Integer)
        {
            System.out.println("Yes it is an instance of the Integer");
        }
        else{
            System.out.println("No it is not an instance of the Integer ");
        }

    }
    
}
