package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Examen {
    public void ejercicio1(){

        Scanner entrada = new Scanner(System.in);

        int num1 = -1; // Inicializa la variable edad con un valor no válido
        while (num1 < 0) { // Continúa solicitando la edad mientras sea negativa
            System.out.println("INTRODUCE UN NUMERO");

            try {
                num1 = entrada.nextInt(); // Lee la entrada de edad

                if (num1 < 0) {
                    num1 = num1 * (-1);
                    System.out.println("El valor absoluto es " + num1);
                }
                else if (num1 > 0){
                    System.out.println("El valor absoluto es "+ num1);
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Debes introducir un número válido.");
                entrada.next(); // Limpiar el buffer del scanner, si no lo pongo queda en bucle infinito.
            }

        }
    }

    public void ejercicio2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("INTRODUCE UN NUOMBRE:");
        String nombre = entrada.next();

        System.out.println("La obra de "+ nombre);

        System.out.println("Introduce el ancho de la pared");
        int ancho = entrada.nextInt();

        System.out.println("Introduce el largo de la pared");
        int largo = entrada.nextInt();

        System.out.println("Introduce el ancho del azulejo");
        int anchoA = entrada.nextInt();

        System.out.println("Introduce el largo del azulejo");
        int largoA = entrada.nextInt();

        if (anchoA > ancho && largoA > largo || anchoA > largo && largoA > ancho){
            System.out.println("El azulejo no puede ser mas grande que la pared");
        }
        else{
            if (anchoA == largoA) {
                System.out.println("El azulejo no puede ser cuadrado");
            }
            else {
                    float res1 = ancho * largo;
                    float res2 = anchoA * largoA;
                    float res3 = res1 / res2;

                    System.out.println("Se necesitan "+ res3 + " azulejos");
            }
        }

    }
}
