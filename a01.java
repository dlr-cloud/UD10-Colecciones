/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;

import java.util.Arrays;

public class a01 {

    // Creamos un método genérico estático 
    public static <T> T[] guardar(T elemento, T[] arrayOriginal) {
        // Creamos una copia con una longitud mayor
        T[] nuevoArray = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 1);
        // Insertamos el elemento en la última posición
        nuevoArray[nuevoArray.length - 1] = elemento;
        return nuevoArray;
    }
    
    public static void main(String[] args) {
        // Hacemos pruebas con Strings
        String[] palabras = {"Hola"};
        palabras = guardar("Mundo", palabras);
        palabras = guardar("Genéricos", palabras);
        System.out.println("Array Strings: " + Arrays.toString(palabras));

        //Hacemos pruebas con Integers
        Integer[] numeros = {1, 2};
        numeros = guardar(10, numeros);
        numeros = guardar(20, numeros);
        System.out.println("Array Integers: " + Arrays.toString(numeros));
    }
}
