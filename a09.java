/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class a09 {

    
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 30 ; i++) {
            int numAleatorio = (int) (Math.random() * 100 + 1);
            numeros.add(numAleatorio);
        }
        System.out.println("La lista de numeros aleatorios entre 1 y 100: " + numeros);
        //Eliminamos los numeros repetidos de la lista usando HashSet de nuestra lista numeros
        Set<Integer> numSinRepetir = new HashSet<>(numeros);
        System.out.println("Lista sin numeros repetidos: " + numSinRepetir);
        //Ordenamos los numeros de la lista con un orden natural usando TreeSet después de eliminar los numeros duplicados de la lista
        Set<Integer> listaOrdenada = new TreeSet<>(numeros);
        System.out.println("Lista ordenada usando TreeSet: " + listaOrdenada);
        //Por ultimo volvemos a ordenar la lista numeros con LinkedHashSet pero esta vez se va a ordenar por el orden de inserción en la lista
        Set<Integer> listaOrdenada2 = new LinkedHashSet<>(numeros);
        System.out.println("Lista ordenada por orden de insercion: " + listaOrdenada2);
    }
    
}

