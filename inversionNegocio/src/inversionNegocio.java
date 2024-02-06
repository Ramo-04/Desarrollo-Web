import java.util.Scanner;

public class inversionNegocio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la hipoteca: ");
        double montoHipoteca = scanner.nextDouble();

        repartirInversionTotal(montoHipoteca);

        scanner.close();
    }

    private static void repartirInversionTotal(double montoHipoteca) {
        double inversionTotal;

        if (montoHipoteca < 1000000) {
            inversionTotal = montoHipoteca / 0.5;

            System.out.println("Usted invertirá el 50% de la inversión total: $" + (inversionTotal / 2));
            System.out.println("Su socio invertirá el otro 50%: $" + (inversionTotal / 2));
        } else {
            inversionTotal = montoHipoteca;

            System.out.println("Usted invertirá el monto total de la hipoteca: $" + inversionTotal);
            System.out.println("El resto del dinero se repartirá a partes iguales entre usted y su socio.");
        }
    }
}
