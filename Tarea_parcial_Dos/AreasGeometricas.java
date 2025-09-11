import java.util.Scanner;

public class AreasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
             System.out.println("Menú de opciones:");
            System.out.println("1. Calcular área de un cuadrado");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Calcular área de un triángulo");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

             switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    System.out.println("El area del cuadrado es:" + (lado * lado));
                    break;
                case 2:
                     System.out.println("Ingrese el largo del rectangulo:");
                    double largo = scanner.nextDouble();
                     System.out.println("Ingrese el ancho del rectangulo:");
                    double ancho = scanner.nextDouble();
                    System.out.println("El area del rectangulo es:" + (largo * ancho));
                    break;
                case 3:
                     System.out.println("Ingrese la base del triangulo:");
                    double base = scanner.nextDouble();
                     System.out.println("Ingrese la altura del triangulo:");
                    double altura = scanner.nextDouble();
                    System.out.println("El area del triangulo es:" + (base * altura));
                    break;
                case 4:
                    System.out.println("Ingrese el radio del circulo:");
                    double radio = scanner.nextDouble();
                    System.out.println("El area del circulo es:" + (Math.PI * Math.pow(radio, 2)));
                    break;
                case 5:
                  System.out.println("Demostracion del calculo de areas:");
                  System.out.println("Cuadrado con lado 5: " + (5 * 5));
                  System.out.println("Rectangulo con largo 4 y ancho 6: " + (4 * 6));
                  System.out.println("Triangulo con base 3 y altura 7: " + (3 * 7 / 2));
                  System.out.println("Radio del circulo 2: " + (Math.PI * Math.pow(2, 2)));
                    break;
                case 6:
                repetir = false;
                break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }
}