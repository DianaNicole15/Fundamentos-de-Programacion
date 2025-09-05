//Verificar Edad
import java.util.Scanner;

public class VerificarEdad{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce tu edad!");
        int edad = sc.nextInt();
    if (edad<18) {
        System.out.println("menor de edad.");
    } else if (edad >= 18 && edad < 65){
        System.out.println("Mayor de edad");
    } else if (edad >= 65){
        System.out.println("adulto mayor");
    }
    sc.close();
    }

}