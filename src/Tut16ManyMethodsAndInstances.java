import java.util.Scanner;

public class Tut16ManyMethodsAndInstances {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tut16ManyMethodsAndInstances2nd newObject = new Tut16ManyMethodsAndInstances2nd();

        System.out.println("What was your first gf's name?");

        String temp = input.nextLine();
        newObject.setName(temp);
        newObject.saying();
    }
}
