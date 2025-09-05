import java.util.Scanner;

public class LlamadaTelefonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la duración de la llamada (en minutos): ");
        int minutos = sc.nextInt();

        System.out.print("¿Es domingo? (s/n): ");
        char esDomingo = sc.next().toLowerCase().charAt(0);

        System.out.print("Si es día hábil, indique turno (m = matutino / v = vespertino / n = ninguno): ");
        char turno = sc.next().toLowerCase().charAt(0);

        // Cálculo del costo base
        double costo = 0;

        if (minutos > 0) {
            if (minutos <= 5) {
                costo = minutos * 1.00;
            } else if (minutos <= 8) {
                costo = 5 * 1.00 + (minutos - 5) * 0.80;
            } else if (minutos <= 10) {
                costo = 5 * 1.00 + 3 * 0.80 + (minutos - 8) * 0.70;
            } else {
                costo = 5 * 1.00 + 3 * 0.80 + 2 * 0.70 + (minutos - 10) * 0.50;
            }
        }

        // Impuestos
        double impuesto = 0;
        if (esDomingo == 's') {
            impuesto = costo * 0.03;
        } else {
            if (turno == 'm') {
                impuesto = costo * 0.15;
            } else if (turno == 'v') {
                impuesto = costo * 0.10;
            }
        }

        double total = costo + impuesto;

        // Resultados
        System.out.printf("Costo base: $%.2f\n", costo);
        System.out.printf("Impuesto: $%.2f\n", impuesto);
        System.out.printf("Total a pagar: $%.2f\n", total);

        sc.close();
    }
}