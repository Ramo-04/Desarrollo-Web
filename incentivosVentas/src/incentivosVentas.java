import java.util.Scanner;

public class incentivosVentas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el importe de las ventas del Departamento 1: $");
        double ventasDepartamento1 = scanner.nextDouble();

        System.out.print("Ingrese el importe de las ventas del Departamento 2: $");
        double ventasDepartamento2 = scanner.nextDouble();

        System.out.print("Ingrese el importe de las ventas del Departamento 3: $");
        double ventasDepartamento3 = scanner.nextDouble();

        double ventasTotales = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
        double umbralIncentivos = 0.33 * ventasTotales;

        double incentivoDepartamento1 = (ventasDepartamento1 > umbralIncentivos) ? 0.20 * ventasDepartamento1 : 0;
        double incentivoDepartamento2 = (ventasDepartamento2 > umbralIncentivos) ? 0.20 * ventasDepartamento2 : 0;
        double incentivoDepartamento3 = (ventasDepartamento3 > umbralIncentivos) ? 0.20 * ventasDepartamento3 : 0;

        double salarioTotalDepartamento1 = ventasDepartamento1 + incentivoDepartamento1;
        double salarioTotalDepartamento2 = ventasDepartamento2 + incentivoDepartamento2;
        double salarioTotalDepartamento3 = ventasDepartamento3 + incentivoDepartamento3;

        System.out.println("Salario total del Departamento 1: $" + salarioTotalDepartamento1);
        System.out.println("Salario total del Departamento 2: $" + salarioTotalDepartamento2);
        System.out.println("Salario total del Departamento 3: $" + salarioTotalDepartamento3);

        scanner.close();
    }
}
