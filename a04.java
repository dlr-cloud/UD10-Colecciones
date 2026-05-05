/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

/**
 *
 * @author ALUMNO
 */
public class a04 {

    public static void main(String[] args) {
        List<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int Aleatorio = (int) (Math.random() * 10 + 1);
            coleccion.add(Aleatorio);
        }
        System.out.println("Array con 100 numeros aleatorios entre 1 y 10 con ambos incluidos: " + coleccion);

        Iterator<Integer> it = coleccion.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num == 5) {
                it.remove();
            }
        }
        System.out.println("Lisa de arrays con los numeros sin el numero 5: " + coleccion);
    }

}
