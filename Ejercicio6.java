//(PUNTO 6.25) -Escribir un programa que lea dos cadenas de caracteres y un número. El programa debe insertar la segunda

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = sc.nextLine();

        System.out.print("Ingrese el número: ");
        int num = sc.nextInt();

        String resultado = insertarCadena(cadena1, cadena2, num);
        System.out.println("Resultado: " + resultado);
    }

    public static String insertarCadena(String cadena1, String cadena2, int pos) {
        return cadena1.substring(0, pos) + cadena2 + cadena1.substring(pos);
    }
}
//Este código toma dos cadenas de texto y un número como entrada y luego usa un método llamado "insertarCadena" para insertar la segunda cadena dentro de la primera cadena en la posición especificada por el número. La cadena resultante se muestra en la consola.