/*(PUNTO 2.17) -Una Empresa q  uiere calcular el salario semanal de cada uno de los "N" obreros que laboran en ella.
-obrero trabaja 40 horas o menos se le paga Bs. 20 por hora
-obrero trabaja mas de 40 horas se le paga Bs. 20 por cada una de las primeras 40 horas y Bs.25 pocada hora extra.
*/

import java.util.Scanner;

public class Ejercicio2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de obreros: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese las horas trabajadas por el obrero " + i + " en la semana: ");
            int horas = sc.nextInt();

            double salario;

            if (horas <= 40) {
                salario = horas * 20;
            } else {
                int horasNormales = 40;
                int horasExtras = horas - horasNormales;
                salario = (horasNormales * 20) + (horasExtras * 25);
            }

            System.out.println("El salario semanal del obrero " + i + " es Bs. " + salario);
        }

        sc.close();
    }
}

/*Este programa te solicita ingresar el número de obreros y las horas trabajadas por cada uno de ellos. Luego, para cada obrero, se calcula su salario semanal según las condiciones dadas en el problema. Finalmente, se muestra el salario de cada obrero en la pantalla.*/