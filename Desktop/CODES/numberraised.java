import java.util.Scanner;
	public class numberraised {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("numberone :");
	int number1 = input.nextInt();

	System.out.print("numbertwo :");
	int number2 = input.nextInt();
	
	int result = 1;
for(int raise = 1; raise <= number2; raise++){
	result *= number1;
}
System.out.println(number1 + " raised to the power of " + number2 + " is " + result);

}


}