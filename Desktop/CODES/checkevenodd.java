import java.util.Scanner;

public class checkevenodd {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

   
        System.out.print("Enter the number of integers: ");
        int number = scanner.nextInt(); 

        System.out.println("Enter the integers:");
        for (int count = 0; count < number; count++) {
            int num = scanner.nextInt();  

            if (num % 2 == 0) 
               int evenSum += num; 
            else {
               int oddSum += num;  
            }
        }

        scanner.close();

        // Print the results
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
