package singletonjava;

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
