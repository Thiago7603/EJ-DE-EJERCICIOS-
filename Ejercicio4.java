//EJERCICIO 4.20 Escribir un procedimiento recursivo que calcule el producto escalar de dos vectores que recibe como parámetros
public class Ejercicio4{
  public static void main(String[] args) {
    double[] vector1 = {1.0, 2.0, 3.0};
    double[] vector2 = {4.0, 5.0, 6.0};

    System.out.println("Producto escalar: " + scalarProduct(vector1, vector2, vector1.length));
  }

  public static double scalarProduct(double[] vector1, double[] vector2, int n) {
    if (n == 1) {
      return vector1[0] * vector2[0];
    } else {
      return vector1[n - 1] * vector2[n - 1] + scalarProduct(vector1, vector2, n - 1);
    }
  }
}
//El procedimiento 'scalarProduct' toma como entrada dos arreglos de doubles ('vector1' y 'vector2') y su longitud ('n'). La lógica recursiva es bastante sencilla: se multiplica el último elemento de cada vector y se suma el resultado con el producto escalar de los n-1 primeros elementos de cada vector. La recursión termina cuando se han procesado todos los elementos de los vectores y se ha retornado la suma de los productos de cada par de elementos correspondientes.

//Nota: Es importante asegurarse de que los dos vectores tengan la misma longitud, ya que de lo contrario el código producirá un error de índice fuera de rango.