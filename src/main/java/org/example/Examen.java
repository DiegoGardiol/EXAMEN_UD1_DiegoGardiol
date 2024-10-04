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
                entrada.next(); // Limpiar el buffer del scanner
            }

        }
    }

    public void ejercicio2(){

    }
}
