import java.util.Scanner;

public class EntradasCine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número de personas: ");
    int numPersonas = scanner.nextInt();

    System.out.print("Ingrese el día de la semana (1-7, donde 1 es lunes y 7 es domingo): ");
    int diaSemana = scanner.nextInt();

    System.out.print("¿Tiene membresía? (s/n): ");
    String membresia = scanner.next();

    double precioTotal = calcularPrecio(numPersonas, diaSemana, membresia.equalsIgnoreCase("s"));

    System.out.println("El precio total es: $" + precioTotal);
  }

  public static double calcularPrecio(int numPersonas, int diaSemana, boolean membresia) {
    double precioBase = 50;
    double precioTotal = 0;

    if (diaSemana == 3) { // Miércoles
      precioTotal = numPersonas * 30;
    } else if (diaSemana == 4) { // Jueves
      int parejas = numPersonas / 2;
      int personasSoltas = numPersonas % 2;
      precioTotal = parejas * 75 + personasSoltas * 50;
    } else {
      precioTotal = numPersonas * precioBase;
    }

    if (membresia) {
      precioTotal *= 0.9; // 10% de descuento
    }

    return precioTotal;
  }
}