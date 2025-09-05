import java.util.Scanner;

public class PresupuestoTartas {
    private static final double PRECIO_MANZANA = 200;
    private static final double PRECIO_FRESA = 250;
    private static final double PRECIO_CHOCOLATE_NEGRO = 280;
    private static final double PRECIO_CHOCOLATE_BLANCO = 300;
    private static final double PRECIO_SNACK = 25;
    private static final double PRECIO_PERSONALIZACION = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el sabor de la tarta:");
        System.out.println("1. Manzana");
        System.out.println("2. Fresa");
        System.out.println("3. Chocolate");
        int sabor = scanner.nextInt();

        double precioTotal = calcularPrecioSabor(sabor, scanner);

        System.out.print("¿Desea agregar snack? (1 para sí, 0 para no): ");
        int snack = scanner.nextInt();
        if (snack == 1) {
            precioTotal += PRECIO_SNACK;
        }

        System.out.print("¿Desea personalizar la tarta con un nombre? (1 para sí, 0 para no): ");
        int personalizacion = scanner.nextInt();
        if (personalizacion == 1) {
            precioTotal += PRECIO_PERSONALIZACION;
        }

        System.out.printf("El precio total es: $%.2f\n", precioTotal);

        scanner.close();
    }

    private static double calcularPrecioSabor(int sabor, Scanner scanner) {
        double precioTotal;

        switch (sabor) {
            case 1:
                precioTotal = PRECIO_MANZANA;
                break;
            case 2:
                precioTotal = PRECIO_FRESA;
                break;
            case 3:
                precioTotal = calcularPrecioChocolate(scanner);
                break;
            default:
                System.out.println("Opción inválida");
                return 0;
        }

        return precioTotal;
    }

    private static double calcularPrecioChocolate(Scanner scanner) {
        System.out.println("Seleccione el tipo de chocolate:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        int tipoChocolate = scanner.nextInt();

        switch (tipoChocolate) {
            case 1:
                return PRECIO_CHOCOLATE_NEGRO;
            case 2:
                return PRECIO_CHOCOLATE_BLANCO;
            default:
                System.out.println("Opción inválida");
                return 0;
        }
    }
}