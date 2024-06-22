import java.util.Random;

public class ExamenFinalVarianteA {
    
    public static void operador(String[] args) {
        Random scanner = null;
        System.out.println("Opción 4: Realizar operación aritmética");
        System.out.print("Ingrese el primer número: ");
        int numA = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numB = scanner.nextInt();
        System.out.print("Ingrese la operación (+, -, *): ");
        int resultadoOperacion = 0;
        char operacion = 0;
        switch (operacion) {
            case '+':
                resultadoOperacion = numA + numB;
                break;
            case '-':
                resultadoOperacion = numA - numB;
                break;
            case '*':
                resultadoOperacion = numA * numB;
                break;
            case '/':
                resultadoOperacion = numA / numB;
                break;
            default:
                System.out.println("Operación no válida");
        }
        System.out.println("El resultado es: " + resultadoOperacion);
    }
}
