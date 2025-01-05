import java.util.Scanner;
	public class TwoNumber {
	public static void main(String[] TwoNumber){

int largest = Integer.MAX_VALUE;
	int smallest = Integer.MIN_VALUE;

	Scanner number = new Scanner(System.in);	
	System.out.println("ENTER FIRST NUMBER :");
	int numone = number.nextInt();

	
	System.out.println("ENTER SECOND NUMBER :");
	int numtwo = number.nextInt();

if(numone < largest){
	largest = numone;
}
if(numone > largest){
	smallest = numone;
}

if(numtwo < largest){
	largest = numtwo;
}
if(numtwo > largest){
	smallest = numtwo;
}
	System.out.println("largest :" +smallest);
System.out.println("smallest :" +largest);


}
}