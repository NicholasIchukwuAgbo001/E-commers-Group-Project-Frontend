import java.util.Scanner;
public class Distance{
	public static void main(String[] Distance){

	Scanner input = new Scanner(System.in);
	System.out.println(" DRIVING DISTANCE : ");
	double distance = input.nextDouble();

	System.out.println(" MILES PER GALLON : ");
	double miles = input.nextDouble();

	System.out.println(" PRICE PER GALLON : ");
	double price = input.nextDouble();

double result = (distance * price) / miles;
System.out.println("RESULT : " +result);
}

}