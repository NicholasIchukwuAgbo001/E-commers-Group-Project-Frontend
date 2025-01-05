import java.util.Scanner;
	public class MilesDriven{
		public static void main(String[] milesdriven){
  
String Choice;


	Scanner input = new Scanner(System.in);
do{

	System.out.println("ENTER MILES DRIVEN :");
	double miles = input.nextDouble(); 

	System.out.println("ENTER GALLON USED :");
	double gallon = input.nextDouble();

	double result = miles / gallon;
	System.out.println("result : " +result);

	System.out.println("DO YOU WANT TO CONTINUE");
	Choice = input.next();
}
while(Choice.equalsIgnoreCase("yes"));
	


}

}