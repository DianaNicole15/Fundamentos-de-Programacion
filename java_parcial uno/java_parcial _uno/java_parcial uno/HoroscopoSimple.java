import java.util.Scanner;

public class HoroscopoSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de día y mes
        System.out.print("Ingresa tu día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        // Comparación para saber el signo zodiacal
        switch(mes) {
            case 1:  System.out.println(dia <= 20 ? "Tu signo zodiacal es Capricornio" : "Tu signo zodiacal es Acuario"); break;
            case 2:  System.out.println(dia <= 19 ? "Tu signo zodiacal es Acuario" : "Tu signo zodiacal es Piscis"); break;
            case 3:  System.out.println(dia <= 20 ? "Tu signo zodiacal es Piscis" : "Tu signo zodiacal es Aries"); break;
            case 4:  System.out.println(dia <= 20 ? "Tu signo zodiacal es Aries" : "Tu signo zodiacal es Tauro"); break;
            case 5:  System.out.println(dia <= 21 ? "Tu signo zodiacal es Tauro" : "Tu signo zodiacal es Géminis"); break;
            case 6:  System.out.println(dia <= 21 ? "Tu signo zodiacal es Géminis" : "Tu signo zodiacal es Cáncer"); break;
            case 7:  System.out.println(dia <= 22 ? "Tu signo zodiacal es Cáncer" : "Tu signo zodiacal es Leo"); break;
            case 8:  System.out.println(dia <= 23 ? "Tu signo zodiacal es Leo" : "Tu signo zodiacal es Virgo"); break;
            case 9:  System.out.println(dia <= 23 ? "Tu signo zodiacal es Virgo" : "Tu signo zodiacal es Libra"); break;
            case 10: System.out.println(dia <= 23 ? "Tu signo zodiacal es Libra" : "Tu signo zodiacal es Escorpio"); break;
            case 11: System.out.println(dia <= 22 ? "Tu signo zodiacal es Escorpio" : "Tu signo zodiacal es Sagitario"); break;
            case 12: System.out.println(dia <= 21 ? "Tu signo zodiacal es Sagitario" : "Tu signo zodiacal es Capricornio"); break;
            default: System.out.println("Mes no válido, ingresa un número del 1 al 12");
        }

        sc.close();
    }
}
