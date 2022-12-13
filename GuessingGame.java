import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        System.out.print("(type in your name)");
        String name = input.next();
        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Will you try to guess my number");
        int number = (int) ((Math.random() * 99) + 1);
        //System.out.println(number);
        int guess = 0;
        int count = 0;
        while (guess != number) {
            count++;
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Well done, " + name + " you found my number in " + count + " tries!");
            }
            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            }
            if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            }
        }
    }
}
