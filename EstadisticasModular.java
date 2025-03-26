import java.util.Scanner;

public class EstadisticasModular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(numeros);
        double desviacion = calcularDesviacion(numeros, promedio);

        System.out.printf("El promedio es %.2f%n", promedio);
        System.out.printf("La desviación estándar es %.5f%n", desviacion);
        
        scanner.close();
    }

    public static double calcularPromedio(double[] datos) {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public static double calcularDesviacion(double[] datos, double promedio) {
        double sumaDiferencias = 0;
        for (double num : datos) {
            sumaDiferencias += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaDiferencias / (datos.length - 1));
    }
}