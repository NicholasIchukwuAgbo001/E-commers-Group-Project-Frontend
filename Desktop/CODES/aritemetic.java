import java.util.Scanner;
	public class aritemetic{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("enter number 1:");
int number1 = input.nextInt();

System.out.print("enter number 2:");
int number2 = input.nextInt();

int number1square = number1 * number1;
int number2square = number2 * number2;
int sumofsquare = number1square + number2square;
int diffrenceofsquare = number1square - number2square;

System.out.println("number1square :" + number1square);
System.out.println("number2square :" + number2square);
System.out.println("sumofsquare :" + sumofsquare);
System.out.println("diffrenceofsquare :" + diffrenceofsquare);
}

}

