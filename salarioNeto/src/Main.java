import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precioHora = 43.333;
        double descuentoImpuestos = 0.19; //19%


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();


        double salarioBruto = horasTrabajadas * precioHora;


        double impuestos = salarioBruto * descuentoImpuestos;


        double salarioNeto = salarioBruto - impuestos;


        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Descuento por impuestos (19%): $" + impuestos);
        System.out.println("Salario neto: $" + salarioNeto);


        scanner.close();
    }
}
