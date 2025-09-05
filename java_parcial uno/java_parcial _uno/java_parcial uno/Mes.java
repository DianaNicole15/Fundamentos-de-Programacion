import java.util.Scanner;

public class Mes {
    public static void main (String[] args){

        Scanner Scanner = new Scanner (System.in);

        System.out.println("Introduce un numero del mes (1-12):");
        int mes = Scanner.nextInt();
        Scanner.close();

        if (mes >= 1 && mes <= 12) {
            String nombreMes ="";
            int dias = 0;

            switch (mes) {
                case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
                case 2:
                nombreMes = "Febrero";
                dias = 28;
                break;
                case 3: 
                nombreMes = "Marzo";
                dias = 31;
                break;
                 case 4: 
                nombreMes = "Abril";
                dias = 30;
                break;
                 case 5: 
                nombreMes = "Mayo";
                dias = 31;
                break;
                 case 6: 
                nombreMes = "Junio";
                dias = 30;
                break;
                 case 7: 
                nombreMes = "Julio";
                dias = 31;
                break;
                 case 8: 
                nombreMes = "Agosto";
                dias = 31;
                break;
                 case 9: 
                nombreMes = "Septiembre";
                dias = 30;
                break;
                 case 10: 
                nombreMes = "Octubre";
                dias = 31;
                break;
                 case 11: 
                nombreMes = "Noviembre";
                dias = 30;
                break;
                 case 12: 
                nombreMes = "Diciembre";
                dias = 31;
                break;

            }

            System.out.println("El mas de"  + nombreMes +  "tiene"  + dias +  "dias.");
        } else {
            System.out.println("Numero de mes invalido. debes estar entre 1 y 12.");
        }
    }

}