import java.util.Scanner;

public class desgloseBolivares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Bolívares: ");
        int cantidadBolivares = scanner.nextInt();

        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};

        System.out.println("Desglose de Bolívares:");

        for (int billete : billetes) {
            int cantidadBilletes = cantidadBolivares / billete;
            if (cantidadBilletes > 0) {
                System.out.println(billete + " Bs: " + cantidadBilletes + " billete(s)");
                cantidadBolivares %= billete;
            }
        }

        scanner.close();
    }
}