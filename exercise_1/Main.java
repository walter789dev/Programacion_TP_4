package exercise_1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberRandom = new Random().nextInt(100) + 1;
        boolean continueGame;
        do {
            System.out.println("¡¡¡ Intenta adivinar el número !!!");
            guessNumber(numberRandom);
            continueGame = validateOption();
        }while (continueGame);
        System.out.println("¡¡¡ Que tenga un buen día !!!");
    }

    private static boolean validateOption(){
        input.nextLine();

        while (true){
            System.out.println("¿Desea jugar nuevamente?: \nS: si \nN: no");
            String option =  input.nextLine().toLowerCase();
            switch (option){
                case "s": return true;
                case "n": return false;
                default: System.out.println("\nOpción invalida, intenta nuevamente\n");
            }
        }
    }

    private static void guessNumber(int number){
        int counter = 1, option;

        while (true){
            System.out.print("Intente adivinar el número: ");
            try {
                option = input.nextInt();
                if (option > number) System.out.println("El número es menor a '" + option + "'\n");
                else if (option < number) System.out.println("El número es mayor a '" + option + "'\n");
                else {
                    System.out.println("\n¡¡¡ Felicitaciones !!!, el número era: " + number +
                            ". Intentos: " + counter);
                    break;
                }
                counter++;
            }catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un número\n");
                input.nextLine();
                counter++;
            }
        }
    }
}
