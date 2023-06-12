package Clase6;

import java.util.Scanner;
public class BuscadorPaises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu pais: ");
        String pais = scanner.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;

        System.out.println("Enlace de busqueda: " + url);

    }
}
