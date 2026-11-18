package com.mycompany.practica3ed;

import java.util.Scanner;

public class Practica3ed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("=== CALCULADORA DE ILYA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Primer numero: ");
                    double a = Double.parseDouble(sc.nextLine());
                    System.out.print("Segundo numero: ");
                    double b = Double.parseDouble(sc.nextLine());

                    if (opcion == 1) {
                        System.out.println("Resultado: " + (a + b));
                    }
                    if (opcion == 2) {
                        System.out.println("Resultado: " + (a - b));
                    }
                    if (opcion == 3) {
                        System.out.println("Resultado: " + (a * b));
                    }
                    if (opcion == 4) {
                        if (b == 0) {
                            System.out.println("No se puede dividir entre 0");
                        } else {
                            System.out.println("Resultado: " + (a / b));
                        }
                    }
                } else if (opcion == 5) {
                    System.out.println("Adios");
                } else {
                    System.out.println("Opcion no valida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida");
            }
        }
    }
}