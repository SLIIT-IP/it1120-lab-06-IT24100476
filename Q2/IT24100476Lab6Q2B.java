import java.util.Scanner;

public class IT24100476Lab6Q2B{
   public static void main(String[] args){

  int count= 1;
  int[] num = new int[10];
  int i =0; 

   Scanner input = new Scanner(System.in);

   System.out.println("Please enter 10 numbers: ");
  
   while(count<= 10) {
             System.out.println("Enter number " + count + " :" );
             num[i] = input.nextInt();
             
             i++;
             count++ ;
            }

     System.out.println("The numbers you entered are: " );
    
     i =0;
     count =1;
     while(count <= 10) {
              System.out.print(num[i] + " ");
              i++;
              count++;
            }
 

   }
}