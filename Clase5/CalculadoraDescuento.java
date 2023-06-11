package Clase5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio original: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = scanner.nextDouble();

        // Calcular el descuento
        double descuento = precioOriginal * (porcentajeDescuento / 100);

        // Calcular el precio con descuento
        double precioConDescuento = precioOriginal - descuento;

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Porcentaje de descuento: " + porcentajeDescuento + "%");
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
}
