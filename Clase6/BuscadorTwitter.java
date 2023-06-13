package Clase6;

import java.util.Scanner;
public class BuscadorTwitter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de una celebridad (de una sola palabra): ");
        String nombre = scanner.nextLine();

        String url = "https://twitter.com/search?q=" + nombre;

        System.out.println("El twitter de la persona que buscabas es: " + url);

    }

}
