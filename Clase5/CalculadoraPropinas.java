package Clase5;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la factura: ");
        double montoFactura = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina que desea dejar (por ejemplo, 10 para el 10%): ");
        double porcentajePropina = scanner.nextDouble();


        double propina = montoFactura * (porcentajePropina / 100);
        double totalPagar = montoFactura + propina;

        System.out.println("Monto de la factura: $" + montoFactura);
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Propina a dejar: $" + propina);
        System.out.println("Total a pagar: $" + totalPagar);

    }
}
