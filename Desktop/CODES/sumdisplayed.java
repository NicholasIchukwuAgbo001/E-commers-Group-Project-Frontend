import java.util.Scanner;
	public class sumdisplayed {
		public static void main(String[] sumdisplayed){
	Scanner input = new Scanner(System.in);
	
	String userChoice;
	do{
		System.out.print("ENTER NUMBER ONE :");
		int number1 = input.nextInt();

		System.out.print("ENTER NUMBER TWO :");
		int number2 = input.nextInt();

	int sum = number1 + number2;
	System.out.println("SUM : " +sum);
	
	System.out.println("do you want to perform again");
	userChoice = input.next("yes");


}while(userChoice == "yes" || userChoice == "yes"); 
System.out.println("GOODBYE");

input.close();
	

}

}