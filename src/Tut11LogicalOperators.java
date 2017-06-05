import java.util.Scanner;

public class Tut11LogicalOperators {
    public static void main(String[] args) {
        int boy, girl;

        Scanner age = new Scanner(System.in);
        System.out.println("What is the male's age?");
        boy = age.nextInt();

        System.out.println("What is the female's age?");
        girl = age.nextInt();

        if (boy > 10 && girl < 60) {
            System.out.println("You can enter");
        } else {
            System.out.println("You cannot enter");
        }

    }
}
