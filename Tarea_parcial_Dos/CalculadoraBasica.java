import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num1, num2;
         char operacion;
         boolean repetir = true;

         do {
            System.out.println("Ingresa el primer numero:");
            num1 = scanner.nextInt();
             System.out.println("Ingresa el segundo mumero:");
            num2 = scanner.nextInt();
            System.out.println("Ingrese la operacion que desea (+, -. *, /):");
            operacion = scanner.next().charAt(0);

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
                System.out.println("Operacion invalidad");
             }
            System.out.println("¿Desea volver hacer? (s / n):");
            char respuesta = scanner.next().charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                repetir = false;
                
            }
         } while (repetir);
    }
}