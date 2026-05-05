package a01;

import java.util.List;
import java.util.ArrayList;

public class a07 {

    public static void main(String[] args) {
        // Creamos la primera lista con los numeros que vamos a añadir con .add
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);

        // Creación de lista2 e inserción
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(99);
        lista2.add(99);

        // Vamos a insertar los numeros por índice
        lista1.add(0, 5);
        lista1.addAll(2, lista2);

        // Mostramos el elemento en índice 4
        System.out.println("Elemento en el índice 4: " + lista1.get(4));

        // Sustituimos el último elemento
        int ultimoIndice = lista1.size() - 1;
        Integer sustituido = lista1.set(ultimoIndice, 500);
        System.out.println("Valor sustituido: " + sustituido);

        // Eliminamos los valores 
        lista1.remove(1);
        lista1.remove(Integer.valueOf(99));

        // Mostramos el estado final de la lista1 despues de ejecutar todo
        System.out.println("Estado final de lista1: " + lista1);
    }
}
