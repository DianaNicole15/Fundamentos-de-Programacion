import java.util.Scanner;

public class Tablas_Multiplicar {
    public static void main(String[] args) {
    int n;
    do {
        System.out.print("Ingrese un numero (0 es para salir): ");
        n = sc.nextInt();
        if (n != 0) {
            for (int i = 1; i <= 10; i++){
                System.out.println(n + "x" + i + "=" + n * i);
            }
        }
    } while (n != 0);
    sc.close();
 }  
}