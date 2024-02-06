import java.util.Scanner;

public class distribucionPresupuesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto presupuestado: ");
        double montoPresupuestado = scanner.nextDouble();

        double ginecologia = montoPresupuestado * 0.4;
        double traumatologia = montoPresupuestado * 0.3;
        double pediatria = montoPresupuestado * 0.3;

        System.out.println("La cantidad de dinero para Ginecología es: " + ginecologia);
        System.out.println("La cantidad de dinero para Traumatología es: " + traumatologia);
        System.out.println("La cantidad de dinero para Pediatría es: " + pediatria);

        scanner.close();
    }
}
