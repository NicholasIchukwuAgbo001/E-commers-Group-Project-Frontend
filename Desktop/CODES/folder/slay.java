import java.util.Scanner;
public class ArrayKata {
    public static void main(String... args) {
   Scanner input = new Scanner(System.in);
// (1)
	System.out.println("how many numbers will array have");
	int size = input.nextInt();
	int[] number = new int[size];

for(int x = 0; x < size; x++) {
	System.out.println("enter number" + (x + 1) );
	number[x] = input.nextInt();
}
int max = number[0];
int min = number[0];
int sum = 0;
int evensum = 0;	
int oddsum = 0;


for (int i = 0; i < number.length; i++) {
	if(number[i] > max){
		max = number[i];
}
// (2)
	if(number[i] < min){
		min = number[i];
}
// (3)
	sum += number[i];

// (4)
	if(number[i] % 2 == 0) {
		evensum += number[i];
} else {
// (5)
	oddsum += number[i];
}

}

int oddCount = 0;
int evenCount = 0;        
// (7)        
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {  
                oddCount++;
} else {
// (8)
	evenCount++;
} 

}

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Even sum: " + evensum);
        System.out.println("Odd sum: " + oddsum);
  	System.out.println("Number of odd numbers: " + oddCount);
	System.out.println("Number of even numbers: " + evenCount);  

// (9)
 System.out.print("Even numbers in list: ");
        for (int even: number) {
		if(even % 2 == 0){ 
            System.out.print(even + " ");
        }
}

// (10)
System.out.print("Odd numbers in list: ");	
	for(int odd : number){
		if(odd % 2 != 0){
	System.out.print(odd + " ");
}
}System.out.println();

// (11)

int square = 1;
for(int num : number){
	square *= num;
}
System.out.println("square of all number in array" + " " + square);
        
}
}
