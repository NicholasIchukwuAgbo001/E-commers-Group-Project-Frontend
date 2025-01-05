 import java.util.Scanner;
	public class TaskOne {
		public static void main(String...args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("what is the size of item:" + " ");
		int size = input.nextInt();
		int[] number = new int[size];
		
		

	for(int m = 0; m < size; m++) {
	System.out.println("enter list" + (m + 1) );
	number[m] = input.nextInt();
}
int Max = number[0];
	for(int l = 0; l < number.length; l++){
		if(number[l] > Max){
			Max = number[l];
}
}
	System.out.print("MAX:" + " " + Max);
	System.out.println();

int[] reversedList = new int[number.length];
	for(int count = 0; count < number.length; count++) {
		reversedList[count] = number[number.length - 1 - count];
}

System.out.print("REVERSED LIST:" + " ");
for(int count = 0; count < number.length; count++){
	System.out.print(reversedList[count] + " ");
}

}
}