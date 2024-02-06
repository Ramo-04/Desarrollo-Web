import java.util.Scanner;

public class porcentajeGanancia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de naranjas (X): ");
        int cantidadNaranjas = scanner.nextInt();

        System.out.print("Ingrese el precio por docena (Bs. Y): ");
        double precioPorDocena = scanner.nextDouble();

        System.out.print("Ingrese los ingresos obtenidos (Bs. K): ");
        double ingresosObtenidos = scanner.nextDouble();

        double inversionInicial = (cantidadNaranjas / 12.0) * precioPorDocena;
        double ganancia = ingresosObtenidos - inversionInicial;

        double porcentajeGanancia = (ganancia / inversionInicial) * 100;

        System.out.println("La inversión inicial fue de Bs. " + inversionInicial);
        System.out.println("La ganancia obtenida fue de Bs. " + ganancia);
        System.out.println("El porcentaje de ganancia obtenida es del " + porcentajeGanancia + "%");

        scanner.close();
    }
}
