package IteratorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /* 
        ArrayList< String > companyList = new ArrayList<>();
        companyList.add("MicroSoft");
        companyList.add("Amazon");
        
        // Traversal -> iterator ka use karke 
        Iterator< String > it = companyList.iterator();

        while( it.hasNext())
        {
            System.out.println( it.next());
        }
        */

        AirForce airForce = new AirForce();
        CustomIterator allPlanes = airForce.createIterator( );

        while (allPlanes.hasNext()) {
            
            System.out.println( allPlanes.next()  );
        }
        

    }

}
