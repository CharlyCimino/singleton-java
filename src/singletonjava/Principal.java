package singletonjava;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caemci
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( Singleton.getConnection("ABC") );
        System.out.println( Singleton.getConnection("XYZ") );
        System.out.println( Singleton.getConnection("JKL") );
    }
    
}
