//EJERCICIO 3.13 Escribir una función que reciba un arreglo de doble y su longitud como parámetros, y retorne el promedio aritmético y el desvío estándar de los valores contenidos en él.
import java.util.Arrays;

public class Ejercicio3 {
  public static void main(String[] args) {
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    int n = values.length;

    System.out.println("Promedio: " + mean(values, n));
    System.out.println("Desvío estándar: " + standardDeviation(values, n));
  }

  public static double mean(double[] values, int n) {
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += values[i];
    }
    return sum / n;
  }

  public static double standardDeviation(double[] values, int n) {
    double mean = mean(values, n);
    double sumOfSquaredDifferences = 0.0;
    for (int i = 0; i < n; i++) {
      double difference = values[i] - mean;
      sumOfSquaredDifferences += difference * difference;
    }
    double variance = sumOfSquaredDifferences / (n - 1);
    return Math.sqrt(variance);
  }
}
//La función 'mean' toma como entrada un arreglo de doubles y su longitud, y retorna el promedio aritmético de los valores. La función 'standardDeviation' toma el mismo arreglo y longitud como entrada, y retorna el desvío estándar de los valores. En ambos casos, la lógica es bastante sencilla: se realiza una suma de los valores y se divide por el número total de valores para calcular el promedio aritmético, y se realiza una suma de las diferencias al cuadrado entre cada valor y el promedio aritmético para calcular la varianza y, finalmente, se calcular la raíz cuadrada de la varianza para obtener el desvío estándar.