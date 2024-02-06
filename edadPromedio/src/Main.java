//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la edad de la primera persona: ");
        int edadPersona1 = scanner.nextInt();


        System.out.print("Ingrese la edad de la segunda persona: ");
        int edadPersona2 = scanner.nextInt();


        System.out.print("Ingrese la edad de la tercera persona: ");
        int edadPersona3 = scanner.nextInt();


        double promedioEdad = (edadPersona1 + edadPersona2 + edadPersona3) / 3.0;


        System.out.println("El promedio de edad es: " + promedioEdad);


        scanner.close();
    }
}

