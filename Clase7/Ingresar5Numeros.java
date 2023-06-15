package Clase7;

import java.util.Scanner;

        public class Ingresar5Numeros {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[5];

                System.out.println("Ingrese 5 números:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                System.out.println("Los números ingresados son:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }

                int numeroMayor = numeros[0];
                int numeroMenor = numeros[0];
                int suma = 0;

                for (int i = 0; i < numeros.length; i++) {
                    suma += numeros[i];

                    if (numeros[i] > numeroMayor) {
                        numeroMayor = numeros[i];
                    }

                    if (numeros[i] < numeroMenor) {
                        numeroMenor = numeros[i];
                    }
                }

                double promedio = (double) suma / numeros.length;

                System.out.println("El número mayor es: " + numeroMayor);
                System.out.println("El número menor es: " + numeroMenor);
                System.out.println("El promedio es: " + promedio);
            }
        }




