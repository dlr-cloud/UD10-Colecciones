/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;

import java.util.*;

public class a11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> inventario = new TreeMap<>();
        
        inventario.put("BUJ-001", 42);
        inventario.put("XYZ-123", 71);
        inventario.put("LMN-456", 28);
        inventario.put("JFK-789", 90);

        Set<String> claves = inventario.keySet();
        for (String producto : claves) {
            System.out.println("Productos: " + producto + " | " + inventario.get(producto));
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("1. Alta Producto");
            System.out.println("2. Baja Producto");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Listar Existencias");
            System.out.println("5. Salir");
            System.out.print("Elige la opcion que quieres ejecutar: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Codigo: ");
                    String clave1 = sc.nextLine();
                    if (inventario.containsKey(clave1)) {
                        System.out.println("Esta clave ya existe inserta otra distinta");
                    } else {
                        System.out.println("Unidades: ");
                        int valor = sc.nextInt();
                        sc.nextLine();
                    }
                }
                case 2 -> {
                    System.out.println("Codigo: ");
                    String clave2 = sc.nextLine();
                    if (inventario.remove(clave2) != null) {
                        System.out.println("El producto ha sido dado de baja");
                    } else {
                        System.out.println("El codigo de producto no existe introduce uno valido");
                    }
                }
                case 3 -> {
                    System.out.println("Codigo: ");
                    String clave3 = sc.nextLine();
                    if (inventario.containsKey(clave3)) {
                        System.out.println("Cantidad nueva de stock: ");
                        int valor3 = sc.nextInt();
                        sc.nextLine();

                        inventario.put(clave3, valor3);
                    } else {
                        System.out.println("No se ha podido crear un nuevo stock");
                    }
                }
                case 4 -> {
                    System.out.println("Existencias actuales: ");
                    Set<String> Clave = inventario.keySet();
                    for (String producto : Clave) {
                        System.out.println("Productos: " + producto + " | " + inventario.get(producto));
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
                default ->
                    System.out.println("Opcion no valida elige otra vez");
            }
        }
        sc.close();
    }

}
