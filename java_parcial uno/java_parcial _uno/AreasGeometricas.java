import java.util.Scanner;

public class AreasGeometricas {
    private static final double PI = 3.14159;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Calcular área de un cuadrado");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Calcular área de un triángulo");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCuadrado();
                    break;
                case 2:
                    calcularAreaRectangulo();
                    break;
                case 3:
                    calcularAreaTriangulo();
                    break;
                case 4:
                    calcularAreaCirculo();
                    break;
                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    private static void calcularAreaCuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        System.out.printf("El área del cuadrado es: %.2f\n", lado * lado);
    }

    private static void calcularAreaRectangulo() {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        System.out.printf("El área del rectángulo es: %.2f\n", base * altura);
    }

    private static void calcularAreaTriangulo() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        System.out.printf("El área del triángulo es: %.2f\n", 0.5 * base * altura);
    }

    private static void calcularAreaCirculo() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        System.out.printf("El área del círculo es: %.2f\n", PI * Math.pow(radio, 2));
    }
}