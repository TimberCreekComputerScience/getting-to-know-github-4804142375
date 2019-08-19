import java.util.Scanner;

public class lemonade{

     public static void main(String []args){
         
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("How many glasses of lemonade would you like?");
         
         int cost = 1;
         
         int amount = scan.nextInt();
         
         double total = cost * amount;
         
         if (amount < 0) {
            System.out.println("Invalid answer."); 
         }
         else{
            System.out.printf("Your total is: $%.2f", total); 
         }
         
     }
}