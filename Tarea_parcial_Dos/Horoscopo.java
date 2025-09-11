import java.util.Scanner;

public class Horoscopo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean repetir = true;

    while (repetir) {
      System.out.print("Ingrese su día de nacimiento (1-31): ");
      int dia = scanner.nextInt();
      System.out.print("Ingrese su mes de nacimiento (1-12): ");
      int mes = scanner.nextInt();

      String signo = determinarSigno(dia, mes);
      System.out.println("Tu signo del zodíaco es: " + signo);

      System.out.print("¿Desea saber el horóscopo de otra persona? (s/n): ");
      String respuesta = scanner.next();
      if (respuesta.equalsIgnoreCase("n")) {
        repetir = false;
      }
    }
  }

  public static String determinarSigno(int dia, int mes) {
    switch (mes) {
      case 1:
        return dia >= 20 ? "Acuario" : "Capricornio";
      case 2:
        return dia >= 19 ? "Piscis" : "Acuario";
      case 3:
        return dia >= 21 ? "Aries" : "Piscis";
      case 4:
        return dia >= 20 ? "Tauro" : "Aries";
      case 5:
        return dia >= 21 ? "Géminis" : "Tauro";
      case 6:
        return dia >= 21 ? "Cáncer" : "Géminis";
      case 7:
        return dia >= 23 ? "Leo" : "Cáncer";
      case 8:
        return dia >= 23 ? "Virgo" : "Leo";
      case 9:
        return dia >= 23 ? "Libra" : "Virgo";
      case 10:
        return dia >= 23 ? "Escorpio" : "Libra";
      case 11:
        return dia >= 22 ? "Sagitario" : "Escorpio";
      case 12:
        return dia >= 22 ? "Capricornio" : "Sagitario";
      default:
        return "Mes inválido";
    }
  }
}