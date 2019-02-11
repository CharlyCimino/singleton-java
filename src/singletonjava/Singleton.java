package singletonjava;

/**
 *
 * @author caemci
 */
public class Singleton {

    private String nombre;
    private static Singleton instanciaUnica;
    
    private Singleton (String nombre) {
        this.nombre = nombre;
        System.out.println("Creando el objeto " + nombre);
    }

    public static Singleton getConnection(String nombre) {
        // Si es la primera vez que se invoca este método, se crea una instancia de Singleton
        if (instanciaUnica == null) { 
            instanciaUnica = new Singleton(nombre);
        }
        return instanciaUnica;
    }

    @Override
    public String toString() {
        return "Objeto " + nombre + ": " + super.toString();
    }
}
