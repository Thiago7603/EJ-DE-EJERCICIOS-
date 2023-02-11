//(PUNTO 1.12)  Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es
//necesario:
//-El año debe ser mayor que cero.
//-El mes debe estar entre 1 y 12.
//-Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que tienen 31 días
//son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año
//bisiesto que es 29 días.

import java.util.Scanner;
class Ejercicio1 {
  public static void main(String[] args) {
    
   Scanner scan = new Scanner(System.in);
    System.out.print("Introduce la fecha (dd:mm:aaaa): ");
    String fecha = scan.nextLine();
    scan.close();

    String[] fechaArray = fecha.split(":");
    int dia = Integer.parseInt(fechaArray[0]);
    int mes = Integer.parseInt(fechaArray[1]);
    int anio = Integer.parseInt(fechaArray[2]);

    boolean esCorrecta = true;

    if (anio <= 0) {
      esCorrecta = false;
    } else if (mes < 1 || mes > 12) {
      esCorrecta = false;
    } else {
      int diasEnMes = 0;
      switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          diasEnMes = 31;
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          diasEnMes = 30;
          break;
        case 2:
          if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
            diasEnMes = 29;
          } else {
            diasEnMes = 28;
          }
          break;
      }
      if (dia < 1 || dia > diasEnMes) {
        esCorrecta = false;
      }
    }

    if (esCorrecta) {
      System.out.println("La fecha es correcta.");
    } else {
      System.out.println("La fecha es incorrecta.");
    }
  }
}
//Este programa toma una fecha en el formato "dd:mm:aa" como entrada del usuario, y luego comprueba si la fecha es correcta. Para ello, divide la cadena de entrada en sus componentes individuales utilizando 'esCorrecta' Indicador booleano a false. Finalmente, el programa muestra si la fecha es correcta o incorrecta en función del valor de 'esCorrecta'.