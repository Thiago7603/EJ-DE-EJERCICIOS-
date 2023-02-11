/*(PUNTO 5.31) Pedir 20 números enteros y luego mostrar cada número distinto ingresado, por ejemplo, si se ingresan 1, 2, 1, 2, 1, 
2 se debe demostrar solo 1 y 2. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadDistintos = 0;

        System.out.println("Ingrese 20 números enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.print("Números distintos ingresados: ");
        for (int i = 0; i < numeros.length; i++) {
            boolean esDistinto = true;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    esDistinto = false;
                    break;
                }
            }
            if (esDistinto) {
                cantidadDistintos++;
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\nCantidad de números distintos ingresados: " + cantidadDistintos);
    }
}
/* En este código se definen los 20 números enteros a ingresar como un arreglo llamado numeros. Luego, se utiliza un bucle for para solicitar el ingreso de cada uno de los números.

Después, se utiliza otro bucle for para recorrer el arreglo y verificar si cada número es distinto a los números ingresados anteriormente. Si es así, se muestra el número y se incrementa un contador de números distintos.

Finalmente, se muestra por pantalla la cantidad de números distintos ingresados.*/