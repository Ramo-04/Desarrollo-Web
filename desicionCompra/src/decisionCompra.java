import java.util.Scanner;

public class decisionCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad inicial de dinero: ");
        double cantidadDinero = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de devaluación del automóvil por año: ");
        double porcentajeDevaluacionAutomovil = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de incremento del terreno por año: ");
        double porcentajeIncrementoTerreno = scanner.nextDouble();

        double valorAutomovil = cantidadDinero;
        double valorTerreno = cantidadDinero;

        for (int i = 0; i < 3; i++) {
            valorAutomovil *= (100 - porcentajeDevaluacionAutomovil) / 100;
            valorTerreno *= (100 + porcentajeIncrementoTerreno) / 100;
        }

        if (devaluacionMenorIgualMitadIncremento(valorAutomovil, valorTerreno)) {
            System.out.println("Es recomendable comprar el automóvil después de tres años.");
        } else {
            System.out.println("No es recomendable comprar el automóvil después de tres años.");
        }

        scanner.close();
    }

    private static boolean devaluacionMenorIgualMitadIncremento(double valorAutomovil, double valorTerreno) {
        double devaluacionAutomovil = 100 - (valorAutomovil / valorTerreno) * 100;
        double incrementoTerreno = (valorTerreno / valorAutomovil - 1) * 100;

        return devaluacionAutomovil <= incrementoTerreno / 2;
    }
}
