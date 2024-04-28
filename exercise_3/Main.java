package exercise_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        while (!input.hasNextDouble()) {
            System.out.print("Ingrese un número válido para la base: ");
            input.next();
        }
        double base = input.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        while (!input.hasNextDouble()) {
            System.out.print("Ingrese un número válido para la altura: ");
            input.next();
        }
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}
