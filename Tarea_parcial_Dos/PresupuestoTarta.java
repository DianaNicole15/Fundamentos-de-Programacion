import java.util.Scanner;

public class PresupuestoTarta {
  public static void main(String[] args) {
    Scanner scanner = new scanner(System.in);

    System.out.println("Seleccione el sabor de la tarta:");
    System.out.println("1. Manzana ($200)");
    System.out.println("2. Fresa ($250)");
    System.out.println("3. Chocolate");
    int sabor = scanner.nextInt();

    double precioTarta = 0;
    switch (sabor) {
      case 1:
        precioTarta = 200;
        break;
      case 2:
        precioTarta = 250;
        break;
      case 3:
        System.out.println("Seleccione el tipo de chocolate:");
        System.out.println("1. Negro ($280)");
        System.out.println("2. Blanco ($300)");
        int tipoChocolate = scanner.nextInt();
        precioTarta = tipoChocolate == 1 ? 280 : 300;
        break;
      default:
        System.out.println("Opción inválida");
        return;
    }

    System.out.print("¿Desea agregar snack? (s/n): ");
    String snack = scanner.next();
    int cantidadSnack = 0;
    if (snack.equalsIgnoreCase("s")) {
      System.out.print("Ingrese la cantidad de snack: ");
      cantidadSnack = scanner.nextInt();
    }

    System.out.print("¿Desea personalizar la tarta con un nombre? (s/n): ");
    String personalizar = scanner.next();
    boolean personalizado = personalizar.equalsIgnoreCase("s");

    double precioTotal = precioTarta + cantidadSnack * 25 + (personalizado ? 30 : 0);

    System.out.println("El precio total es: $" + precioTotal);
  }
}