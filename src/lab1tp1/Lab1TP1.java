/*
 * Diseñar un programa que lea y guarde razas de perros 
en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle,
el mismo se guardará en la lista 
y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. 
Si decide salir, se mostrará todos los perros guardados en el ArrayList.


*/
package lab1tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mgts
 */
public class Lab1TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String busco = null;
        
        Scanner lectura = new Scanner (System.in);
         
         boolean continuamos=true;
         
         System.out.println("**** TP 1 PUNTO 1 guardar Razas de Perros en un ArrayList de tipo String ****");

         List <String> razas= new ArrayList();
         
//       

while (continuamos){
         
System.out.println("Ingrese una RAZA: ");

String raza = lectura.next().toUpperCase();

razas.add(raza);


//quiere guardar otro perro(otra raza de perro) o si quiere salir?

System.out.println("¿Quiere guardar otro perro(otra raza de perro)?   SI/NO");

String rta = lectura.next();
if(rta.equalsIgnoreCase("si")){
    continuamos=true;
  
}else if (rta.equalsIgnoreCase("no")){
    
    //Si decide salir, se mostrará todos los perros guardados en el ArrayList
    //foreacho SOLO PARA MOSTRAR
    System.out.println("recorro con foreach");
    
    for (String razaAux : razas) {
        
        System.out.println(razaAux);
        
    }
    
     System.out.println("recorro con for i ");
    
    for (int i = 0; i < razas.size(); i++) {
        
        System.out.println(razas.get(i));
        
    }
      
    
    
    
    continuamos=false;
}else{
    System.out.println("ni SI ni NO...respuesta inesperada. Guarda otra raza!!");
    continuamos=true;
   
}


        
    }
    

System.out.println("**** TP 1 PUNTO 2 BUSCAR Razas de Perros ELIMINAR MOSTRAR ****");


    
    /* Continuando el ejercicio anterior, después de mostrar los perros, 
    al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, 
    se buscará el perro en la lista. 
    Si el perro está en la lista, 
    se eliminará el perro que ingresó el usuario 
    y se mostrará la lista ordenada. 
    Si el perro no se encuentra en la lista, 
    se le informará al usuario y se mostrará la lista ordenada.*/
    
    
    
         Scanner lectura2 = new Scanner (System.in);
         
        
System.out.println("Ingrese una RAZA: ");

        busco = lectura2.next().toUpperCase();
    
    
      System.out.println("recorro con ITERATOR");
      
      
      Iterator <String> it= razas.iterator();
      
      Boolean encontrada=false;
      
      while(it.hasNext()){
          
          String aux= it.next();
          
          System.out.println(aux);
           
          
          if(aux.equalsIgnoreCase(busco)){//.equals es de objeto a objeto
              
              it.remove();
              System.out.println("borrando= "+busco);
              encontrada=true;
              
          }
          
      }
      if (!encontrada){
          
          System.out.println("la raza no fue encontrada");
      }
      
        System.out.println("System.out.println(razas);");
      System.out.println(razas); 
      
        System.out.println("Collections.sort(razas); ");
      Collections.sort(razas); 
      
        System.out.println("System.out.println(razas);");
      System.out.println(razas);
      
    
      
        
    }}
      
    
        
        
    
    
    
