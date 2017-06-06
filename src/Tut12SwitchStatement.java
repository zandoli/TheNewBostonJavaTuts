import java.util.Scanner;

public class Tut12SwitchStatement {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("What was your exam mark?");

        int mark = scn.nextInt();
        if(mark>100){
            System.out.println("Try again. Your mark should not be higher than 100.");
        }else{

        switch (mark/10){
            case 10:
            case 9:
                System.out.println("You got an A");
                break;
            case 8:
                System.out.println("You got a B");
                break;
            case 7:
                System.out.println("You got a C");
                break;
            case 6:
                System.out.println("You got a D");
                break;
            case 5:
                System.out.println("You got an E");
                break;
            default:
                System.out.println("You failed");
            }
        }
    }
}
