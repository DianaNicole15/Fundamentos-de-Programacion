//CalcularResultado
public class CalcularResultado{
    public static void main(String[] args) {
        System.out.println(calcularResultado(2, 3, 5)); // Ejemplo
        System.out.println(calcularResultado(3, 4, 3)); // Ejemplo
    }

    public static int calcularResultado(int a, int b, int c) {
        int sumaAb = a + b;
        int sumaBc = b + c;
        int sumaAc = a + c;

        // Si cualquier par suma 10
        if (sumaAb == 10 || sumaBc == 10 || sumaAc == 10) {
            return 10;
        }
        // Si ab es 10 más que bc o ac
        else if (sumaAb == sumaBc + 10 || sumaAb == sumaAc + 10) {
            return 5;
        }
        // De lo contrario
        else {
            return 0;
        }
    }
}