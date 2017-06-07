import java.util.Scanner;

public class Tut15MethodsWithParameters {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Tut15MethodsWithParameters2nd objt2 = new Tut15MethodsWithParameters2nd();

        System.out.println("What is your name?");
        String name = scn.nextLine();

        objt2.simpleMsg2(name);
    }
}
