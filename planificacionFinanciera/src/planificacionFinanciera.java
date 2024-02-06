import java.util.Scanner;

public class planificacionFinanciera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el saldo actual del capital: ");
        double saldoActual = scanner.nextDouble();

        planificarDecisionesFinancieras(saldoActual);

        scanner.close();
    }

    private static void planificarDecisionesFinancieras(double saldoActual) {
        double nuevoSaldo;
        double presupuestoEquipoComputo = 5000;
        double presupuestoMobiliario = 2000;

        if (saldoActual < 0) {
            nuevoSaldo = 10000;
        } else if (saldoActual <= 20000) {
            nuevoSaldo = 20000;
        } else {
            nuevoSaldo = saldoActual;
        }

        double restoPresupuesto = nuevoSaldo - presupuestoEquipoComputo - presupuestoMobiliario;
        double presupuestoInsumos = restoPresupuesto / 2;
        double presupuestoIncentivos = restoPresupuesto / 2;

        System.out.println("Presupuesto para equipo de cómputo: $" + presupuestoEquipoComputo);
        System.out.println("Presupuesto para mobiliario: $" + presupuestoMobiliario);
        System.out.println("Presupuesto para insumos: $" + presupuestoInsumos);
        System.out.println("Presupuesto para incentivos al personal: $" + presupuestoIncentivos);

        if (saldoActual < 0 || saldoActual <= 20000) {
            double cantidadPrestamo = nuevoSaldo - saldoActual;
            System.out.println("Se pedirá un préstamo al banco por $" + cantidadPrestamo);
        }
    }
}
