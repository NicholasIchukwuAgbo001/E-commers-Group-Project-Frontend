import java.util.Scanner;
public class ChristmasSnack {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
			System.out.print(" ENTER TOTAL AMOUNT OF SUCCESSFUL DELIVERY: ");
				int userinput = input.nextInt();

int basePay = 5000;
int collectionrate1 = 160;
int collectionrate2 = 200;
int collectionrate3 = 250;
int collectionrate4 = 500;

	if(userinput < 50) {
	System.out.print("WAGES OF THE DAY :" + (userinput * collectionrate1 + basePay));

} else if (userinput >= 50 && userinput <= 59) {
	System.out.print("WAGES OF THE DAY :" + (userinput * collectionrate2 + basePay));

} else if (userinput >= 60 && userinput <= 69) {
	System.out.print("WAGES OF THE DAY :" + (userinput * collectionrate3 + basePay));

} else if (userinput >= 70) {
	System.out.print("WAGES OF THE DAY :" + (userinput * collectionrate4 + basePay));
} 


}


}