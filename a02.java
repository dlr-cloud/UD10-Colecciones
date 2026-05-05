/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class a02 {

    public static void main(String[] args) {
        System.out.println("Dime numeros enteros que no sean -1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();

        while (num != -1) {
            try {
                //num = sc.nextInt();
                numeros.add(num);
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es valido"); 
                sc.next();  
            }
        }
                
                
        System.out.println("Este es el array con los numeros introducidos hasta -1;" + numeros);
        
        System.out.println("Valores pares: ");
        for (Integer n : numeros) {
            if (n %2 == 0) {
                System.out.println(n + " ");
            }
        }
        System.out.println();
        
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            int actual = iterador.next();
                if (actual %3 == 0) {
                    iterador.remove();
                }
        }
        System.out.println("Array sin los multiplos de 3: " + numeros);
        sc.close();
    }

}
