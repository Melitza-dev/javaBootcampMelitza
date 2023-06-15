package Clase6;

import java.util.Scanner;
public class Whatsapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de telefono sin espacios: ");
        String telefono = scanner.nextLine();

        String url = "https://api.whatsapp.com/send?phone=" + telefono;

        System.out.println("Puedes llamar por Whatsapp pinchando aqui " + url);

     }
}

