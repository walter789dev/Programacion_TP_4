package exercise_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        double n;
        int position = 0;
        String cadena;

        for (double valore : valores) System.out.printf("%.2f ", valore);

        System.out.print("\nIntroduce la posición del array a modificar: ");
        cadena = sc.nextLine();

        try{
            position = Integer.parseInt(cadena);
        }catch (NumberFormatException e){
            System.out.println("Ingrese un valor numérico valido");
            return;
        }

        try{
            double value = valores[position];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El valor ingresado excede el arreglo");
            return;
        }

        try{
            System.out.print("Introduce el nuevo valor de la posición " + position + ": ");
            n = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ingrese un valor numérico valido");
            return;
        }

        System.out.println("Posición a modificar " + position);
        System.out.println("Nuevo valor: " + n);
        System.out.println("Contenido del array modificado:");
        for (double valore : valores) System.out.printf("%.2f ", valore);
    }
}
