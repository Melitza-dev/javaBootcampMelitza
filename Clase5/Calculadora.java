package Clase5;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
            int edadPerro;
            int edadVerdaderaPerro;

        System.out.print("¿Cuantos años tiene tu perro?: ");

        edadPerro = teclado.nextInt();
        edadVerdaderaPerro = edadPerro * 7;

        System.out.println("La edad de tu perro es " + edadVerdaderaPerro);






    }


}
