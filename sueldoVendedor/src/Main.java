import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();


        System.out.print("Ingrese el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();


        System.out.print("Ingrese el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();


        System.out.print("Ingrese el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();


        double comisiones = 0.1 * (venta1 + venta2 + venta3);


        double sueldoTotal = sueldoBase + comisiones;


        System.out.println("El total por comisiones es: " + comisiones);
        System.out.println("El sueldo total es: " + sueldoTotal);


        scanner.close();
    }
}
