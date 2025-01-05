import java.util.Scanner;
	public class sumandaverage{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("enter number 1:");
int number1 = input.nextInt();

System.out.print("enter number 2:");
int number2 = input.nextInt();

System.out.print("enter number 3:");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
int average = sum / 3;
int product = number1 * number2 * number3;

int smallest;

if(number1 <= number2 && number1 <= number3){
 smallest = number1;
}
else if(number2 <= number1 && number2 <= number3){
 smallest = number2;
}
 else {
  smallest = number3;
}

int largest;

if(number1 >= number2 && number1 >= number3){
 largest = number1;
}

if(number2 >= number1 && number2 >= number3){
 largest = number2;
}
else{
 largest = number3;
}

System.out.println("SUM :" + sum);
System.out.println("AVERAGE:" + average);
System.out.println("PRODUCT :" + product);
System.out.println("SMALLEST :" + smallest);
System.out.println("LARGEST :" + largest);


}


}