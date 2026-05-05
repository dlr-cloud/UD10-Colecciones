/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class a08 {

    public static void main(String[] args) {
        //Creamos ambos listas de strings con los nombres ya iniclializados
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
        
        //Comparamos ambas listas para comprobar que son iguales y mostramos su resultado
        System.out.println("El resultado de ambas listas es: " + listaA.equals(listaB));
        
        //Buscamos las posiciones donde aparece el nombre de Luis por primera y ultima vez
        int PrimeraVez = listaB.indexOf("Luis");
        int UltimaVez = listaB.lastIndexOf("Luis");
        
        System.out.println("Primera posicion en la que aparece el nombre Luis:" + PrimeraVez);
        System.out.println("Ultima posicion en la que aparece el nombre Luis:" + UltimaVez);
        
        //Ordenamos la listaA en orden alfabético usando null
        listaA.sort(null);

        //Comparamos si listaA y listaB son iguales y muestra el resultado
        System.out.println("Orden de las listas tras ordenara la listaA: " + listaA.equals(listaB));
        
        //Ordenamos la listaB en orden alfabético inverso usando sort y luego usando un comparator.reverseOrder para ordenarla al reves
        listaB.sort(Comparator.reverseOrder());
        System.out.println("ListaB ordenada a la inversa: " + listaB);
    }
}

