import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10);
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        System.out.println("let`s go");
        Thread.sleep(1000);

        int i = 0;
while (i < 15) {
    System.out.print("\r" + random.nextInt(10) + "|" + random.nextInt(10) + "|" + random.nextInt(10));
    Thread.sleep(500);
    i++;
}

        System.out.print("\r" + num + "|" + num1 + "|" + num2 + "\n");

        if (num == num1 && num1 == num2) {
            System.out.println("win");
        }else {
            System.out.println("lose");
        }
    }
}