import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int sizeNumber = 10;
    public static int userNumber;
    public  static int restartGame;
    public static int finishOrStart;


    public static void main(String[] args) {
        System.out.println("Компьютер загадал число от 0 до 10");
        do {
            gamesPlay(3);
            System.out.println("Если хотите продолжить игру, то введите 1. Если нет, то 0.");
            restartGame = scanner.nextInt();


        } while (restartGame != finishOrStart);
        System.out.println("Спасибо за игру!");


        scanner.close();
    }

    public static void gamesPlay(int counter) {
        float computerNumber = (int) (Math.random() * sizeNumber);
        while (counter > 0) {
            System.out.println("Введите число от 0 до 10 ");
            int userNumber = scanner.nextInt();

            if (userNumber > computerNumber) {
                System.out.println("Вы ввели число больше, чем компьютер");
                counter--;
                System.out.println("Осталось попыток: " + counter);
            } else if (userNumber < computerNumber) {
                System.out.println("Вы ввели число меньше, чем компьютер");
                counter--;
                System.out.println("Осталось попыток: " + counter);
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }

}


