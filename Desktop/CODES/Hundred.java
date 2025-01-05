//collect two input from user if the sum is greater than hundred say greater than hundread else print leaser than hundread

import java.util.Scanner;

public class Hundred{
	public static void main(String[] Hundred){

		Scanner hundred = new Scanner(System.in);
	System.out.println("check if user input greater than hundred");
	System.out.println("enter first number");
	int number1 = hundred.nextInt();
	
	System.out.println("enter second number");
	int number2 = hundred.nextInt();	
int sum = number1 + number2;
System.out.println("sum :" +sum);

if(sum > 100){
System.out.print("greater than hundred");

}else if(sum < 100){
System.out.println("lesser than hundred");

}else if(sum == 100){
System.out.println("equal to hundred");
}


}


}