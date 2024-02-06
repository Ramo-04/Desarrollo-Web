import java.util.Scanner;

public class compraRefacciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: $");
        double montoCompra = scanner.nextDouble();

        double porcentajeInversion;
        double porcentajeCredito;
        double tasaInteresCredito = 0.20;

        if (montoCompra > 500000) {
            porcentajeInversion = 0.55;
            porcentajeCredito = 0.30;
        } else {
            porcentajeInversion = 0.70;
            porcentajeCredito = 0.30;
        }

        double inversionPropia = montoCompra * porcentajeInversion;
        double creditoFabricante = montoCompra * porcentajeCredito;
        double interesesCredito = creditoFabricante * tasaInteresCredito;
        double prestamoBanco = montoCompra - inversionPropia - creditoFabricante;

        System.out.println("Cantidad a invertir de los fondos de la empresa: $" + inversionPropia);
        System.out.println("Cantidad a pagar a crédito al fabricante: $" + creditoFabricante);
        System.out.println("Monto a pagar por intereses: $" + interesesCredito);

        if (prestamoBanco > 0) {
            System.out.println("Cantidad prestada al banco: $" + prestamoBanco);
        }

        scanner.close();
    }
}
