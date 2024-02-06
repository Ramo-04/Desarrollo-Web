public class sucesionAritmetica {

    public static void main(String[] args) {
        int a1 = 6;
        int d = 5;
        int n = 12;

        int a12 = a1 + (n - 1) * d;

        int suma = (n / 2) * (2 * a1 + (n - 1) * d);

        System.out.println("El término doceavo (a12) es: " + a12);
        System.out.println("La suma de los doce primeros términos es: " + suma);
    }
}
