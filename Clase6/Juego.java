package Clase6;

import java.util.Scanner;
        import java.util.Random;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel, Tijeras!");
        System.out.println("Ingrese su elección: piedra, papel o tijeras");
        String eleccionUsuario = scanner.nextLine();

        int eleccionComputadora = random.nextInt(3);  // Genera un número aleatorio entre 0 y 2

        String eleccionComputadoraTexto = "";
        switch (eleccionComputadora) {
            case 0:
                eleccionComputadoraTexto = "piedra";
                break;
            case 1:
                eleccionComputadoraTexto = "papel";
                break;
            case 2:
                eleccionComputadoraTexto = "tijeras";
                break;
        }

        System.out.println("La elección de la computadora es: " + eleccionComputadoraTexto);

        // Determinar el ganador
        if (eleccionUsuario.equals(eleccionComputadoraTexto)) {
            System.out.println("Empate!");
        } else if (eleccionUsuario.equals("piedra")) {
            if (eleccionComputadoraTexto.equals("papel")) {
                System.out.println("¡La computadora gana! Papel envuelve a piedra.");
            } else if (eleccionComputadoraTexto.equals("tijeras")) {
                System.out.println("¡Felicidades, ganaste! Piedra rompe tijeras.");
            }
        } else if (eleccionUsuario.equals("papel")) {
            if (eleccionComputadoraTexto.equals("piedra")) {
                System.out.println("¡Felicidades, ganaste! Papel envuelve a piedra.");
            } else if (eleccionComputadoraTexto.equals("tijeras")) {
                System.out.println("¡La computadora gana! Tijeras cortan papel.");
            }
        } else if (eleccionUsuario.equals("tijeras")) {
            if (eleccionComputadoraTexto.equals("piedra")) {
                System.out.println("¡La computadora gana! Piedra rompe tijeras.");
            } else if (eleccionComputadoraTexto.equals("papel")) {
                System.out.println("¡Felicidades, ganaste! Tijeras cortan papel.");
            }
        } else {
            System.out.println("Elección inválida. Por favor, ingrese piedra, papel o tijeras.");
        }
    }
}
