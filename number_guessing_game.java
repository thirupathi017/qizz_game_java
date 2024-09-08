import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int a=r.nextInt(1,5);
        System.out.println("Welcome to number guessing game");
        System.out.println("Ihave selected number between 1 to 100");
        System.out.println("can you guess what is it?");
        do{
            System.out.println("enter the Guess:");
            int guess=s.nextInt();
            if(a==guess){
                System.out.println("congratulation you guessed the correct answer");
                break;

            }
            else if(guess>a){
                System.out.println("too High");
            }
            else if(guess<a){
                System.out.println("too Low");
            }
            

        }while(true);
    }
}
