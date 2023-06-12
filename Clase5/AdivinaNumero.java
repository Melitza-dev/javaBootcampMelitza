package Clase5;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numeroAdivinado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número entre 1 y 100.");

        while (numeroAdivinado != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            numeroAdivinado = scanner.nextInt();
            intentos++;

            if (numeroAdivinado < numeroSecreto) {
                System.out.println("El número a adivinar es mayor.");
            } else if (numeroAdivinado > numeroSecreto) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }

    }
}

