package Clase6;

import java.util.Scanner;

public class CreaTuPropiaAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la aventura!");

        // Primer paso de la historia
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: ");
        System.out.println("1. Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2. Sigues el sendero iluminado hacia una pequeña cabaña acogedora");

        int opcion = scanner.nextInt();

        if (opcion == 1) {

            System.out.println(" Exploras la oscuridad en busca de la fuente de un susurro escalofriante. ¿Qué decides hacer?");
            System.out.println("1. Seguir el sonido del susurro");
            System.out.println("2. Ignorar el susurro y seguir explorando");

            opcion = scanner.nextInt();

            if (opcion == 1) {

                System.out.println("Mueres");

            } else if (opcion == 2) {

                System.out.println("Te pierdes.");

            } else {
                System.out.println("Opción inválida.");
            }

        } else if (opcion == 2) {

            System.out.println("Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
            System.out.println("1. Entras");
            System.out.println("2. Sigues caminando");

            opcion = scanner.nextInt();

            if (opcion == 1) {

                System.out.println("¡Has perdido!");

            } else if (opcion == 2) {

                System.out.println("logras escapar. ¡Felicidades!");

            } else {
                System.out.println("Opción inválida.");
            }

        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}
