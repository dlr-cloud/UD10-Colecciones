/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class a06 {

    
    public static void main(String[] args) {
        //Creamos una coleccion en la cual vamos a guardar numeros que van del 1 al 100 incluidos
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int Num = (int) (Math.random() * 100 + 1);
            numeros.add(Num);
        }
        //Creamos una nueva coleccion a la que toma como referencia a la primera coleccion que hemos creado para guardar el resultado principal
        List<Integer> coleccion = new ArrayList<>(numeros);
        
        //Ahora volcamos la coleccion en un Integer[] para convertirlo en un array y poder ordenarlo 
        Integer [] miArray = numeros.toArray(new Integer[0]);
        //Ordenamos la tabla de menor a mayor
        Arrays.sort(miArray);
        
        //Ponemos la tabla ordenada en una nueva coleccion para poder mostrarla por pantalla
        List<Integer> coleccionOrdenada = new ArrayList <>(Arrays.asList(miArray));
        
        System.out.println("Coleccion original: " + coleccion );
        System.out.println("Coleccion ordenada de mayor a menor: " + coleccionOrdenada);
        
        //Para mostrar la coleccion de mayor a menor hacemos lo siguiente
        Arrays.sort(miArray, Collections.reverseOrder());
         //Creamos la lista para el orden inverso y la mostramos
        List<Integer> coleccionInversa = new ArrayList<>(Arrays.asList(miArray));
        System.out.println("Coleccion ordenada de mayor a menor: " + coleccionInversa);
    }
    
}
