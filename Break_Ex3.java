import java.util.Scanner;
  public class Break_Ex3{
     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     int counter = 0;

     System.out.println("Guess the number between 1 and 10:");
     System.out.println("You have 10 attempts");

     while(input.hasNext()){
        counter ++;
        if((input.nextInt() == 8) || (counter == 10)){
         System.out.println("Game Over!");
         break;
         }
    }
  }
}
