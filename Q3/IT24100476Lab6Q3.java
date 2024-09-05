import java.util.Scanner;

public class IT24100476Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

          
            // Check if the input is -99 to terminate
            if (number == -99) {
                break;
            }

          

            
            if (number > 0) {
                sumOfSquares += Math.pow(number, 2); // Simplified using Math.pow()
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
            }
        }

        

        // Calculate Root Mean Square (RMS) 
         double rms = Math.sqrt((double) sumOfSquares / count);
         System.out.printf("The Root Mean Square (RMS) is: %.4f\n", rms);
        
                

   }
}
                    