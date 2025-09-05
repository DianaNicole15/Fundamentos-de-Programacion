import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        switch (operacion) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("%d / %d = %.2f\n", num1, num2, (float) num1 / num2);
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Error: Operador inválido");
                break;
        }

        scanner.close();
    }
}