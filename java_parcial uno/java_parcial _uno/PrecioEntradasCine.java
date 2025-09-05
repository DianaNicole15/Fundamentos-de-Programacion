 import java.util.Scanner;

public class PrecioEntradasCine {
    private static final double PRECIO_BASE = 50;
    private static final double PRECIO_MIERCOLES = 30;
    private static final double PRECIO_PAREJA = 75;
    private static final double DESCUENTO_MEMBRESIA = 0.1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (1-7, donde 1 es lunes y 7 es domingo): ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el número de personas: ");
        int personas = scanner.nextInt();

        System.out.print("¿Tiene membresía? (1 para sí, 0 para no): ");
        int membresia = scanner.nextInt();

        double precioTotal = calcularPrecio(dia, personas, membresia);

        System.out.printf("El precio total es: $%.2f\n", precioTotal);

        scanner.close();
    }

    private static double calcularPrecio(int dia, int personas, int membresia) {
        double precioTotal;

        switch (dia) {
            case 3: // Miércoles
                precioTotal = personas * PRECIO_MIERCOLES;
                break;
            case 4: // Jueves
                if (personas % 2 == 0) {
                    precioTotal = (personas / 2) * PRECIO_PAREJA;
                } else {
                    precioTotal = ((personas - 1) / 2) * PRECIO_PAREJA + PRECIO_BASE;
                }
                break;
            default:
                precioTotal = personas * PRECIO_BASE;
                break;
        }

        if (membresia == 1) {
            precioTotal *= (1 - DESCUENTO_MEMBRESIA);
        }

        return precioTotal;
    }
}