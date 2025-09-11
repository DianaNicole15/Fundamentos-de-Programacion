import java.util.Scanner;

public class Hora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la hora (0-23): ");
    int hora = scanner.nextInt();

    String saludo = "";
    if (hora >= 6 && hora <= 12) {
      saludo = "Buenos días";
    } else if (hora >= 13 && hora <= 20) {
      saludo = "Buenas tardes";
    } else {
      saludo = "Buenas noches";
    }

    System.out.println(saludo);


    System.out.println("Demostración del funcionamiento:");
    for (int i = 0; i < 24; i++) {
      String saludoDemo = "";
      if (i >= 6 && i <= 12) {
        saludoDemo = "Buenos días";
      } else if (i >= 13 && i <= 20) {
        saludoDemo = "Buenas tardes";
      } else {
        saludoDemo = "Buenas noches";
      }
      System.out.println("Hora: " + i + " - " + saludoDemo);
    }
  }
}