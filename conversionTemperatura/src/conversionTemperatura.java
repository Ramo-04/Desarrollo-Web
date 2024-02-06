public class conversionTemperatura {

    public static void main(String[] args) {
        System.out.println("Fahrenheit   Celsius   Kelvin   Rankine");

        imprimirTabla(28, 54, 1);
        imprimirTabla(450, 950, 50);
        imprimirTabla(-50, 250, 10);
    }

    private static void imprimirTabla(int inicio, int fin, int intervalo) {
        for (int fahrenheit = inicio; fahrenheit <= fin; fahrenheit += intervalo) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            double kelvin = celsius + 273.15;
            double rankine = fahrenheit + 459.67;

            System.out.printf("%-12d%-9.2f%-8.2f%-8.2f%n", fahrenheit, celsius, kelvin, rankine);
        }
    }
}
