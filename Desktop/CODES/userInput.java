import java.util.Scanner;

public class userInput{
	public static void main(String[] Hundred){

		Scanner hundred = new Scanner(System.in);
	System.out.println("pick 1 for english");
	System.out.println("pick 2 for yoruba");
	System.out.println("pick 3 for hausa");


	System.out.println("enter your input");
	int userinput = hundred.nextInt();

	if(userinput == 1)System.out.println("Good Morning");

	if(userinput == 2)System.out.println("E ka aro");
	
	if(userinput == 3)System.out.println("kadan kadan");	

}

}