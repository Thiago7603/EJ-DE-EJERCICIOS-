//EJERCICIO 7.5 Un programa que pida datos de 8 personas: nombre, día de nacimiento, mes de nacimiento, y año de nacimiento. Después deberá repetir lo siguiente: preguntar un número de mes y mostrar en pantalla los datos de las personas que cumplan los años durante ese mes. Terminará de repetirse cuando se teclee 0 como número de mes.
import java.util.Scanner;

class Persona {
String nombre;
int diaNacimiento;
int mesNacimiento;
int anioNacimiento;

Persona(String nombre, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
this.nombre = nombre;
this.diaNacimiento = diaNacimiento;
this.mesNacimiento = mesNacimiento;
this.anioNacimiento = anioNacimiento;
}
}

public class Ejercicio7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Persona[] personas = new Persona[8];

for (int i = 0; i < 8; i++) {
  System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
  System.out.print("Nombre: ");
  String nombre = sc.nextLine();
  System.out.print("Día de nacimiento: ");
  int diaNacimiento = sc.nextInt();
  System.out.print("Mes de nacimiento: ");
  int mesNacimiento = sc.nextInt();
  System.out.print("Año de nacimiento: ");
  int anioNacimiento = sc.nextInt();
  sc.nextLine();

  personas[i] = new Persona(nombre, diaNacimiento, mesNacimiento, anioNacimiento);
}

int mes = -1;
while (mes != 0) {
  System.out.print("Ingrese un número de mes (0 para salir): ");
  mes = sc.nextInt();
  sc.nextLine();

  if (mes == 0) {
    break;
  }

  System.out.println("Personas que cumplen años en el mes " + mes + ":");
  for (int i = 0; i < 8; i++) {
    if (personas[i].mesNacimiento == mes) {
      System.out.println("Nombre: " + personas[i].nombre + " - Día de nacimiento: " + personas[i].diaNacimiento + " - Mes de nacimiento: " + personas[i].mesNacimiento + " - Año de nacimiento: " + personas[i].anioNacimiento);
    }
  }
}

sc.close();
}
}
//Este código Java define una clase que almacena información sobre una persona, incluyendo su nombre, día de nacimiento, mes de nacimiento y año de nacimiento. En el método, el código crea una matriz de 8 objetos y recopila información sobre cada una de las 8 personas del usuario.'Persona','main','Persona'. Luego, el código entra en un bucle donde solicita al usuario que ingrese un número que representa un mes. Si el usuario escribe 0, el bucle termina. Si el usuario introduce cualquier otro número, el código recorre la matriz de objetos e imprime el nombre y la información de nacimiento de las personas que nacieron en el mes introducido.'Persona'. Finalmente, el objeto se cierra para liberar los recursos que contenía.Scanner