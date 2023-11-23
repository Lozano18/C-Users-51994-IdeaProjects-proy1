package gestionturismo;
import java.util.Scanner;
public class establecimiento {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del establecimiento turistico");
        Scanner nombre = new Scanner(System.in);
        String nombreEst = nombre.next();
        System.out.println("************************************************");
        System.out.println("Ingrese la direccion ");
        Scanner direc = new Scanner(System.in);
        String direcEst = direc.next();
        System.out.println("************************************************");
        System.out.println("Ingrese cantidad de turistas ");
        Scanner cantur = new Scanner(System.in);
        int canTurista = cantur.nextInt();
    }



}
