import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numDia; 

        String nomDia;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        numDia=leer.nextInt();

        switch (numDia) {
            case 1:
                nomDia = "Lunes";
                break;
            case 2:
                nomDia = "Martes";
                break;
            case 3:
                nomDia = "Miércoles";
                break;
            case 4:
                nomDia = "Jueves";
                break;
            case 5:
                nomDia = "Viernes";
                break;
            case 6:
                nomDia = "Sábado";
                break;
            case 7:
                nomDia = "Domingo";
                break;
            default:
                nomDia = "Número de día inválido";
                break;
        }

        System.out.println("El día correspondiente al número " + numDia + " es: " + nomDia);
    }
}
