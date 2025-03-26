/**
 * Clase de Ecuacion Cuadratica
 * 
 * @autor Gabriela Apaza Cauna
 * @oversion 1.0 24/03/2025
 * 
 */

import java.util.Scanner;
import java.util.Locale;

public class EcuacionCuadraticaModular{

    // Método para calcular el discriminante
    public static double getDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    // Método para calcular la primera raíz
    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    // Método para calcular la segunda raíz
    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Asegura que Scanner acepte punto decimal

        try {
            System.out.print("Ingrese a, b, c: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double discriminante = getDiscriminante(a, b, c);

            if (discriminante > 0) {
                double raiz1 = getRaiz1(a, b, discriminante);
                double raiz2 = getRaiz2(a, b, discriminante);
                System.out.println("La ecuación tiene dos raíces " + raiz1 + " y " + raiz2);
            } else if (discriminante == 0) {
                double raiz = -b / (2 * a);
                System.out.println("La ecuación tiene una raíz " + raiz);
            } else {
                System.out.println("La ecuación no tiene raíces reales");
            }
        } catch (Exception e) {
            System.out.println("Error: Verifica que los números estén bien escritos.");
        } finally {
            scanner.close();
        }
    }
}
