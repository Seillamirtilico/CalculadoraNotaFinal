import java.util.Scanner;

public class CalculoNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número de materias
        System.out.print("Te amo carol: ");
        int numMaterias = scanner.nextInt();

        // Inicializar los arrays
        int[] primerCorte = new int[numMaterias];
        int[] segundoCorte = new int[numMaterias];
        int[] creditos = new int[numMaterias];

        // Ingreso de notas del primer corte
        System.out.println("Ingrese las notas del primer corte:");
        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            primerCorte[i] = scanner.nextInt();
        }

        // Ingreso de notas del segundo corte
        System.out.println("Ingrese las notas del segundo corte:");
        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            segundoCorte[i] = scanner.nextInt();
        }

        // Ingreso de créditos
        System.out.println("Ingrese los créditos de cada materia:");
        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            creditos[i] = scanner.nextInt();
        }

        // Cálculo del 40% del primer corte ponderado por créditos
        double primerCortePonderado = calcularPonderado(primerCorte, creditos) * 0.4;

        // Cálculo del 60% del segundo corte ponderado por créditos
        double segundoCortePonderado = calcularPonderado(segundoCorte, creditos) * 0.6;

        // Nota final
        double notaFinal = primerCortePonderado + segundoCortePonderado;
        System.out.println("La nota final es: " + notaFinal);

        scanner.close();
    }

    private static double calcularPonderado(int[] notas, int[] creditos) {
        double sumaNotas = 0;
        int sumaCreditos = 0;

        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i] * creditos[i];
            sumaCreditos += creditos[i];
        }

        return sumaNotas / sumaCreditos;
    }
}
