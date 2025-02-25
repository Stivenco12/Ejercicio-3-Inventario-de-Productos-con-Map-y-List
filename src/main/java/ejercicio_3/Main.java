package ejercicio_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String menu;
            Map<String, List<String>> categoria = new HashMap<>();
            
            do {
                System.out.println("Ingrese la cantidad de categorías que desea registrar");
                int cantidad = sc.nextInt();
                sc.nextLine();
                
                for (int i = 1; i <= cantidad; i++) {
                    System.out.println("Ingrese el nombre de la categoría");
                    String cap = sc.nextLine();
                    System.out.println("Ingrese los productos de la categoría separados por comas");
                    String produc = sc.nextLine();
                    categoria.put(cap, new ArrayList<>(Arrays.asList(produc.split(","))));
                }
                
                do {
                    System.out.println("\nMenú:\n1. Mostrar productos de una categoría específica\n2. Agregar producto a una categoría\n3. Mostrar todas las categorías y productos\n4. Salir");
                    menu = sc.nextLine();
                    
                    switch (menu) {
                        case "1":
                            System.out.println("Ingrese el nombre de la categoría a consultar");
                            String catConsulta = sc.nextLine();
                            System.out.println("Productos: " + categoria.getOrDefault(catConsulta, new ArrayList<>()));
                            break;
                        case "2":
                            System.out.println("Ingrese la categoría donde desea agregar un producto");
                            String catAgregar = sc.nextLine();
                            if (categoria.containsKey(catAgregar)) {
                                System.out.println("Ingrese el producto a agregar");
                                String nuevoProducto = sc.nextLine();
                                categoria.get(catAgregar).add(nuevoProducto);
                            } else {
                                System.out.println("Categoría no encontrada");
                            }
                            break;
                        case "3":
                            System.out.println("Lista de categorías y productos:");
                            categoria.forEach((key, value) -> System.out.println(key + ": " + value));
                            break;
                        case "4":
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción no válida, intente de nuevo");
                    }
                } while (!menu.equals("4"));
                
            } while (false); // Evita el bucle innecesario en la inicialización
            
        } catch (Exception e) {
            System.out.println("Error, por favor vuelva a ejecutar el programa");
        }
    }
}