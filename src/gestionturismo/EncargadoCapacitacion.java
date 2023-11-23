package gestionturismo;
import java.util.Scanner;
public class EncargadoCapacitacion {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del encargado");
        Scanner nombre = new Scanner(System.in);
        String nombreEncar = nombre.next();
        System.out.println("************************************************");
        System.out.println("Ingrese el sueldo  ");
        Scanner sueldo = new Scanner(System.in);
        int suelEncar = sueldo.nextInt();
        System.out.println("************************************************");
        System.out.println("cantidad de capacitaciones ");
        Scanner canti = new Scanner(System.in);
        int canCap = canti.nextInt();
    }



}
