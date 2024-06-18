
import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        System.out.println("____________________________________________________________");
        System.out.println("Welcome to NumberGame!!!\nFind the Number within 10 attempts to win the game.");
        System.out.println("____________________________________________________________");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int answer = rand.nextInt(100)+1;
        int trycount=0;
        while(true){
            trycount++;
            if(trycount==10){
                System.out.println("Sorry,You Loose!\nYou have reached the maximum number of Attempts");
                break;
            }
             System.out.println("Guess a number between 1 - 100 : ");
             int guess = sc.nextInt();
                if (guess == answer) {
                    System.out.println("Congratulations!! You won.\nYou took "+trycount+" attempts to find the number.");
                    break;
                }
                else if (guess < answer) System.out.println("Wrong!The number is bigger.Guess Again!");
                else System.out.println("Wrong! The number is smaller.Guess Again!");
        }
    }
}