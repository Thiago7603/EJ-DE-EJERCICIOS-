/*(PUNTO 8.20) Dado el siguiente algoritmo: 
clase Número 
var
// Atributos 
privado entero : min, complemen, iesimo 
// Métodos: 
público
entero método mínimo(E entero: X) 
// Retorna el mínimo de los dígitos que conforman a X 
entero método hallarI(E entero: X, i) 
// Retorna el i-ésimo de los dígitos que conforman a X 
entero método complemento(E entero X) 
27
// Retorna un número conformado por los complementos de los dígitos de X 
método escribirResultado() 
// Escribe por pantalla los valores de los atributos de la clase 
fin_clase 
Se desea que desarrolle los métodos de la clase de acuerdo a lo que indican sus respectivas especificaciones así 
como el constructor de la misma. */

public class Ejercicio8 {
    private int min;
    private int complemento;
    private int iesimo;

    public Ejercicio8() {
        this.min = 0;
        this.complemento = 0;
        this.iesimo = 0;
    }

    public int minimo(int x) {
        int minimo = 9;
        int digito;

        while (x > 0) {
            digito = x % 10;

            if (digito < minimo) {
                minimo = digito;
            }

            x = x / 10;
        }

        this.min = minimo;
        return minimo;
    }

    public int hallarI(int x, int i) {
        int digito = 0;
        int contador = 1;

        while (x > 0 && contador <= i) {
            digito = x % 10;
            x = x / 10;
            contador++;
        }

        this.iesimo = digito;
        return digito;
    }

    public int complemento(int x) {
        int complemento = 0;
        int digito;

        while (x > 0) {
            digito = x % 10;
            complemento = complemento * 10 + (9 - digito);
            x = x / 10;
        }

        this.complemento = complemento;
        return complemento;
    }

    public void escribirResultado() {
        System.out.println("Mínimo: " + this.min);
        System.out.println("I-ésimo: " + this.iesimo);
        System.out.println("Complemento: " + this.complemento);
    }
}

/* En este código se definen los 20 números enteros a ingresar como un arreglo llamado numeros. Luego, se utiliza un bucle for para solicitar el ingreso de cada uno de los números.

Después, se utiliza otro bucle for para recorrer el arreglo y verificar si cada número es distinto a los números ingresados anteriormente. Si es así, se muestra el número y se incrementa un contador de números distintos.

Finalmente, se muestra por pantalla la cantidad de números distintos ingresados. */