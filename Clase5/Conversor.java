package Clase5;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia en millas: ");
        double millas = scanner.nextDouble();

        // Convertir millas a kilómetros
        double kilometros = millas * 1.60934;

        System.out.println(millas + " millas equivale a " + kilometros + " kilómetros.");
        }

    }


