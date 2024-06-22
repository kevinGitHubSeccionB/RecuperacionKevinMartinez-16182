import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int option = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1.Realizar operación +,-,*,/ ");
            System.out.println("2.");
            System.out.println("3.Ingresar un estudiante ");
            System.out.println("4.Ingresar lista de 5 estudiantes");
            System.out.println("5. Mostrar lista de estudiantes");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.println("Realizar operación +,-,*,/");
                    new ExamenFinalVarianteA();
                    break;
                case 3:
                    // Opción 3: Ingresar un estudiante
                    System.out.println("Opción 3: Ingresar un estudiante");
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la calificación del estudiante: ");
                    double calificacion = scanner.nextDouble();
                    Estudiante estudiante = new Estudiante(nombre, calificacion);
                    System.out.println("Estudiante ingresado: " + estudiante.getNombre() + " con calificación " + estudiante.getCalificacion());
                    break;

                case 4:
                    // Opción 4: Ingresar lista de 5 estudiantes
                    System.out.println("Opción 4: Ingresar lista de 5 estudiantes");
                    estudiantes.clear();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                        String nombreEst = scanner.nextLine();
                        System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
                        double calificacionEst = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar el buffer
                        estudiantes.add(new Estudiante(nombreEst, calificacionEst));
                    }
                    System.out.println("Lista de estudiantes ingresada.");
                    break;

                case 5:
                    // Opción 5: Mostrar lista de estudiantes
                    System.out.println("Opción 5: Mostrar lista de estudiantes");
                    for (Estudiante est : estudiantes) {
                        System.out.println("Nombre: " + est.getNombre() + ", Calificación: " + est.getCalificacion());
                    }
                    break;

                case 9:
                    // Opción 9: Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 9.");
                    break;
            }
        } while (option != 9);

        scanner.close();
    }
}
class Estudiante {
    private String nombre;
    private double calificacion;

    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}