import java.util.Scanner;

public class deporteTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        String deporte = "";

        if (temperaturaFahrenheit > 85) {
            deporte = "Natación";
        } else if (temperaturaFahrenheit > 70 && temperaturaFahrenheit <= 85) {
            deporte = "Tenis";
        } else if (temperaturaFahrenheit > 32 && temperaturaFahrenheit <= 70) {
            deporte = "Golf";
        } else if (temperaturaFahrenheit > 10 && temperaturaFahrenheit <= 32) {
            deporte = "Esquí";
        } else if (temperaturaFahrenheit <= 10) {
            deporte = "Marcha";
        }

        System.out.println("Deporte apropiado para la temperatura: " + deporte);

        scanner.close();
    }
}
