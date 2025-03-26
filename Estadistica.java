
import java.util.Scanner;

class Estadistica{
    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    
    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double promedio = promedio();
        double sumaDiferencias = 0;
        for (double num : datos) {
            sumaDiferencias += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaDiferencias / (datos.length - 1));
    }
}


