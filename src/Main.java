import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1.Realizar operación +,-,*,/ ");
            System.out.println("2.");
            System.out.println("3. ");
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

            }
        }while (option != 9);
        scanner.close();
    }
}