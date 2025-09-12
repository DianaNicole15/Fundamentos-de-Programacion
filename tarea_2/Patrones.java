import java.util.Scanner;

public class Patrones {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Seleccione un patrón:");
    System.out.println("1. Triángulo");
    System.out.println("2. Triángulo invertido");
    System.out.println("3. Cuadrado");
    System.out.println("4. Pirámide");
    int opcion = sc.nextInt();
    System.out.println("Ingrese el número de líneas: ");
    int n = sc.nextInt();

    switch (opcion) {
      case 1:
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
            System.out.print("* ");
          }
          System.out.println();
        }
        break;
      case 2:
        for (int i = n; i >= 1; i--) {
          for (int j = 1; j <= i; j++) {
            System.out.print("* ");
          }
          System.out.println();
        }
        break;
      case 3:
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {
            System.out.print("* ");
          }
          System.out.println();
        }
        break;
      case 4:
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
          }
          for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("* ");
          }
          System.out.println();
        }
        break;
      default:
        System.out.println("Opción inválida");
    }
    sc.close();
  }
}