/**
 * Clase de Ecuacion Cuadratica
 * 
 * @autor Gabriela Apaza Cauna
 * @oversion 1.0 24/03/2025
 * 
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        try {
            System.out.print("Ingrese a, b, c: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            
            EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);

           
            ecuacion.resolverEcuacion();
        } catch (Exception e) {
            System.out.println("Error: Verifica que los números estén bien escritos.");
        } finally {
            scanner.close();
        }
    }
}
