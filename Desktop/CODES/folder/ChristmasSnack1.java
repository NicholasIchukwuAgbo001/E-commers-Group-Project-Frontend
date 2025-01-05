import java.util.Scanner;

public class ChristmasSnack1 {
    public static void main(String[] args) {
       
        String[] pizzaTypes = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int[] slicesPerBox = {4, 6, 8, 12};
        int[] pricesPerBox = {2500, 2900, 4000, 5200};

       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int numberOfPeople = input.nextInt();      
 System.out.print("""
		pizza type:
	0 = Sapa size, 
	1 = Small Money, 
	2 = Big boys, 
	3 = Odogwu 
		Enter the pizza type:
""");
        
	int pizzaType = input.nextInt();


        int slicesPerBoxChosen = slicesPerBox[pizzaType];
        int pricePerBoxChosen = pricesPerBox[pizzaType];


        int boxesNeeded = numberOfPeople / slicesPerBoxChosen;
        if (numberOfPeople % slicesPerBoxChosen != 0) {
            boxesNeeded++; // If there are leftover guests, we need one more box
        }


        int totalSlices = boxesNeeded * slicesPerBoxChosen;
        int leftoverSlices = totalSlices - numberOfPeople;


        int totalPrice = boxesNeeded * pricePerBoxChosen;


        System.out.println("Number of boxes of pizza to buy = " + boxesNeeded + " boxes");
        System.out.println("Number left over slices after serving = " + leftoverSlices + " slices");
        System.out.println("Price = " + totalPrice);

   }
}
