import java.util.Scanner;
public class TaskTwo {
	public static void main(String... args) {

	Scanner input = new Scanner(System.in);
	System.out.print("input number of elements:" + " ");
	int size = input.nextInt();
	int[] number = new int[size];

for(int m = 0; m < size; m++) {
	System.out.print("enter element" + (m + 1) + ": " );
	number[m] = input.nextInt();
}

int[] reversedList = new int[number.length];
for(int count = 0; count < number.length; count++) {
	reversedList[count] = number[number.length - 1 - count];

}

System.out.print("REVERSED LIST OF ELEMENTS: ");
for(int count = 0; count < number.length; count++){
	System.out.print(reversedList[count] + " ");
}


}
}