import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int correctPin = 1234;
        Scanner keyboard = new Scanner(System.in);



        for (int i = 0; i<3; i++){


        System.out.println("Hello please enter your pin.");
        int userPin = keyboard.nextInt();
        if (userPin == correctPin){
            System.out.println("Password is correct");
            break;
        }
        }
    }
}