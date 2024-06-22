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
            System.out.println("4. ");
            System.out.println("5. ");
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
                    System.out.println("Opción 6: Ingresar un estudiante");
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la calificación del estudiante: ");
                    double calificacion = scanner.nextDouble();
                    Estudiante estudiante = new Estudiante(nombre, calificacion);
                    System.out.println("Estudiante ingresado: " + estudiante.getNombre() + " con calificación " + estudiante.getCalificacion());
                    break;
            }
        }while (option != 9);
        scanner.close();
    }
}