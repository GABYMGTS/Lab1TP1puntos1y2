/*
  
 */
package lab1tp1;

import java.util.Comparator;

/**
 *
 * @author mgts
 */
public class Perro {
    
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Perro() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    /*
    public static Comparator<Perro> compararEdad = new Comparator<Perro>() {
        
        
        @Override 
        
        public int compare(Perro p1, Perro p2) 
        { 
            return p2.getEdad().compareTo(p1.getEdad());}

    
        }
*/
            }
