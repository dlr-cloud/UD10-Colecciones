/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;
import java.util.ArrayList;
import java.util.List;

public class a03 {
    public static void main(String[] args) {
        List<Integer> aleatorios = new ArrayList<>();
        
        // Hago un for para ir añadiendo numeros hasta tener 20
        for (int i = 0; i < 20; i++) {
            int numAleatorio = (int) (Math.random() * 10 + 1);
            aleatorios.add(numAleatorio);
        }
        System.out.println("Lista con 20 numeros aleatorios: " + aleatorios);
        
        //Voy a filtrar los numeros repetidos creando una segunda lista usando un for para que los numeros repetidos no se añadan a la lista
        List<Integer> sinRepeticion = new ArrayList<>();
        for (Integer num : aleatorios) {
            if (!sinRepeticion.contains(num)) {
                sinRepeticion.add(num);
            }
        }
        
        System.out.println("Lista sin repeticion: " + sinRepeticion);
    }
}
