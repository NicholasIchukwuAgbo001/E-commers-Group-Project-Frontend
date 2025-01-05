import java.util.Scanner;
	public class largestsmallest {
	public static void main(String[] largestsmallest){

		Scanner input = new Scanner(System.in);
String userChoice;	
	int largest = Integer.MAX_VALUE;
	int smallest = Integer.MIN_VALUE;

do{	
	System.out.println("ENTER NUMBER");
	int number1 = input.nextInt();

	if(number1 < largest){
 largest = number1;
}

		if(number1 > largest){
 smallest = number1;
}	
	System.out.println("DO YOU WANT TO CONTINUE");
	userChoice = input.next();

}while(userChoice.equalsIgnoreCase("yes"));

System.out.println("largest :" +smallest);
System.out.println("smallest :" +largest);

}
}