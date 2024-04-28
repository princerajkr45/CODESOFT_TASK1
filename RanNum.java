
import java.util.Scanner;
import java.util.Random;

class RanNum{
    public static void main(String[] args){

        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int score=0;
   
        System.out.println("Enter how many round you want to play ");
        int round=sc.nextInt();
        for(int i=1;i<=round;i++){
            System.out.println("Round "+i);

            boolean pass=true;  
            int turns=5;
            int genNum=random.nextInt(100);

            while(pass && turns>0){
            System.out.println("Enter guess nummber : and you have only "+turns+" turns left");
            int userNum=sc.nextInt();
            turns--;

            if(genNum>userNum){
                System.out.println("Too low : ");
            }   
            else if(genNum<userNum){
                System.out.println("Too high : ");
           } 
           else{
                System.out.println("Correct guess! : ");
                score++;
                pass=false;
           }   
          }
          
        }
        System.out.println("You played "+round+" round");
        System.out.println("You got "+score+" correct guesses out of "+round+" rounds played.");
    }
}