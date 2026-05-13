/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;
import java.util.*;

public class a12 {

    public static void main(String[] args) {
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000, 50, 500, 50, 200));
        int Cantidad = Collections.frequency(premios, 50);
        System.out.println("Hay un total de: "+ Cantidad + " premios de 50");
        System.out.println("La cantidad maxima de premios es: " + Collections.max(premios) + " \ny la cantidad minima de premio es: "+ Collections.min(premios));
        
        Collections.shuffle(premios);
        System.out.println("La lista desordenada seria: " + premios);
        
        Set<Integer> Orden = new TreeSet<>(premios);
        System.out.println("La lista ordenada es: " + Orden);
        
        int posicion = Collections.binarySearch(premios, 500);
        System.out.println("La posicion de 500 es: " + posicion);
    }
    
}
