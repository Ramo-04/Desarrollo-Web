import java.util.Scanner;

public class sueldoTrabajador {
    public static void main(String[] args) {

        String nombre;
        int horasNormales, horasExtras, hijos;
        double pagoHoraNormal, asignacionAcademica, asignacionHijos, primaHogar;


        double porcentajeParoForzoso = 0.05;
        double porcentajePoliticaHabitacional = 0.02;
        double porcentajeCajaAhorro = 0.07;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas normales trabajadas: ");
        horasNormales = scanner.nextInt();

        System.out.print("Ingrese el pago por hora normal: ");
        pagoHoraNormal = scanner.nextDouble();

        System.out.print("Ingrese el número de horas extras trabajadas: ");
        horasExtras = scanner.nextInt();

        System.out.print("Ingrese el número de hijos: ");
        hijos = scanner.nextInt();


        asignacionAcademica = 25000;
        asignacionHijos = 17300;
        primaHogar = 18000;


        double totalAsignaciones = asignacionAcademica + (asignacionHijos * hijos) + primaHogar;


        double salarioNormal = horasNormales * pagoHoraNormal;
        double salarioExtras = horasExtras * (pagoHoraNormal * 1.25);
        double salarioBruto = salarioNormal + salarioExtras;


        double deduccionParoForzoso = salarioBruto * porcentajeParoForzoso;
        double deduccionPoliticaHabitacional = salarioBruto * porcentajePoliticaHabitacional;
        double deduccionCajaAhorro = salarioBruto * porcentajeCajaAhorro;

        double totalDeducciones = deduccionParoForzoso + deduccionPoliticaHabitacional + deduccionCajaAhorro;


        double sueldoNeto = salarioBruto + totalAsignaciones - totalDeducciones;


        System.out.println("Asignaciones:");
        System.out.println("  - Asignación académica: " + asignacionAcademica);
        System.out.println("  - Asignación por hijos (" + hijos + " hijos): " + asignacionHijos * hijos);
        System.out.println("  - Prima por hogar: " + primaHogar);
        System.out.println("Total de asignaciones: " + totalAsignaciones);

        System.out.println("\nDeducciones:");
        System.out.println("  - Deducción paro forzoso (" + (porcentajeParoForzoso * 100) + "%): " + deduccionParoForzoso);
        System.out.println("  - Deducción política habitacional (" + (porcentajePoliticaHabitacional * 100) + "%): " + deduccionPoliticaHabitacional);
        System.out.println("  - Deducción caja de ahorro (" + (porcentajeCajaAhorro * 100) + "%): " + deduccionCajaAhorro);
        System.out.println("Total de deducciones: " + totalDeducciones);

        System.out.println("\nSueldo Neto para " + nombre + ": " + sueldoNeto);


        scanner.close();
    }
}
