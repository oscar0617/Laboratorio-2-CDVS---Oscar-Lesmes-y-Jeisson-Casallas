package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length >= 2) {
            String nombre = args[0];
            String apellido = args[1];
            System.out.println("Hola, " + nombre + " "+ apellido + "!");
        } else {
            System.out.println("Hello world!");
        }
    }
}
