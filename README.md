# Ejercicio 3 Inventario de Productos con Map y List

Este programa en Java permite gestionar categorías y productos, permitiendo al usuario registrar, consultar y modificar información de manera interactiva.

## Características

- Permite ingresar múltiples categorías y asociarles productos.
- Almacena la información en un `HashMap<String, List<String>>`.
- Ofrece un menú interactivo con opciones para:
  - Consultar productos de una categoría específica.
  - Agregar nuevos productos a una categoría existente.
  - Mostrar todas las categorías junto con sus productos.
- Manejo básico de excepciones para evitar fallos inesperados.

## Tecnologías utilizadas

- Java 8 o superior
- Librerías utilizadas: `java.util.HashMap`, `java.util.ArrayList`, `java.util.Arrays`, `java.util.Scanner`

## Cómo ejecutar el programa

1. Compila el archivo con el siguiente comando:
   ```bash
   javac Main.java
   ```
2. Ejecuta el programa con:
   ```bash
   java ejercicio_3.Main
   ```

## Explicación del código

1. Se utiliza un `Scanner` para capturar la entrada del usuario.
2. Se solicita la cantidad de categorías a registrar.
3. Se ingresa cada categoría y sus productos asociados, almacenándolos en un `HashMap<String, List<String>>`.
4. Se despliega un menú interactivo con las siguientes opciones:
   - **Mostrar productos de una categoría específica**: Permite al usuario ingresar el nombre de una categoría y ver los productos asociados.
   - **Agregar productos a una categoría existente**: Solicita el nombre de la categoría y el nuevo producto a agregar.
   - **Mostrar todas las categorías y productos**: Muestra el contenido completo del `HashMap`.
   - **Salir**: Termina la ejecución del programa.
5. Se repite el menú hasta que el usuario elija salir.

## Autor

Este código fue creado como un ejercicio de práctica en Java para manejo de mapas, listas y entrada de usuario.

jedier stivenson correa amariz

