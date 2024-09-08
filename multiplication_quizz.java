import java.util.*;
public class multiplication_quizz{
    public static void main(String[] args){
        System.out.println("Welcome to the multiplication practice program");
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int k=0;
        int p=0;
        while(true){
            k+=1;
            int a=r.nextInt(1,10);
            int b=r.nextInt(1,10);
            int c=a*b;
            
            System.out.println("what is"+a+"*"+b);
            System.out.print("Enter answer(or 0 for exit):");
            int o=s.nextInt();
            if(o==c){
                System.out.println("correct");
                p+=1;
            }
            if(o==0){
                break;
            }
            System.out.println("score"+p+"/"+k);
        }
    }
}
