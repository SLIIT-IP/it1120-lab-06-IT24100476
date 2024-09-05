import java.util.Scanner;

public class IT24100476Lab6Q2C{
   public static void main(String[] args){

  int count= 1;
  int[] num = new int[12];
  int i =0; 
  int sum =0;
  double average ;

   Scanner input = new Scanner(System.in);

   System.out.println("Please enter 10 numbers: ");
  
   while(count<= 10) {
             System.out.println("Enter number " + count + " :" );
             num[i] = input.nextInt();
            
             sum = sum + num[i];
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

    System.out.println("\nSum of the numbers : " + sum);
  
    //Type Casting: (double) sum converts the value of sum from an int type to a double type. 
    average = (double)sum/10;
    System.out.println("Average of the numbers : " + average);

   }
}