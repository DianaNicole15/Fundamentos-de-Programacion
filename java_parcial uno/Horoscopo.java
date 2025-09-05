import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        scanner.close();

        String signo = determinarSigno(mes, dia);

        if (signo != null) {
            System.out.println("Tu signo del zodiaco es: " + signo);
            System.out.println("Horóscopo: " + obtenerHoroscopo(signo));
        } else {
            System.out.println("Fecha de nacimiento inválida.");
        }
    }

    public static String determinarSigno(int mes, int dia) {
        if (mes == 1) {
            if (dia >= 20) return "Acuario";
            else return "Capricornio";
        } else if (mes == 2) {
            if (dia >= 19) return "Piscis";
            else return "Acuario";
        } else if (mes == 3) {
            if (dia >= 21) return "Aries";
            else return "Piscis";
        } else if (mes == 4) {
            if (dia >= 20) return "Tauro";
            else return "Aries";
        } else if (mes == 5) {
            if (dia >= 21) return "Géminis";
            else return "Tauro";
        } else if (mes == 6) {
            if (dia >= 21) return "Cáncer";
            else return "Géminis";
        } else if (mes == 7) {
            if (dia >= 23) return "Leo";
            else return "Cáncer";
        } else if (mes == 8) {
            if (dia >= 23) return "Virgo";
            else return "Leo";
        } else if (mes == 9) {
            if (dia >= 23) return "Libra";
            else return "Virgo";
        } else if (mes == 10) {
            if (dia >= 23) return "Escorpio";
            else return "Libra";
        } else if (mes == 11) {
            if (dia >= 22) return "Sagitario";
            else return "Escorpio";
        } else if (mes == 12) {
            if (dia >= 22) return "Capricornio";
            else return "Sagitario";
        }
        return null;
    }

    public static String obtenerHoroscopo(String signo) {
        String[] horoscopos = {
            "Aries: Connection failed",
            "Tauro: Connection failed",
            
        };

    
        switch (signo) {
            case "Aries":
                return "Consulta tu horóscopo en Internet ";
            case "Tauro":
                return "Consulta tu horóscopo en Internet";
            // Agrega más casos según sea necesario
            default:
                return "Consulta tu horóscopo en Internet";
        }
    }
}