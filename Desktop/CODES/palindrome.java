import java.util.Scanner;
	public class palindrome{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("ENTER THREE DIGIT NUMBER:");
int threedigitnumber = input.nextInt();

int palindrome = 10;
int lastdigit = threedigitnumber % palindrome;
threedigitnumber /=palindrome;
int twodigit = threedigitnumber / palindrome; 
int middledigit = threedigitnumber % palindrome;
threedigitnumber /=palindrome;
int firstdigit = threedigitnumber / palindrome;

if(firstdigit == lastdigit){System.out.println("THREE DIGIT NUMBER IS PALIDROME");
}

else{System.out.println("THREE DIGIT NUMBER IS NOT PALIDROME");
}


System.out.println("LAST DIGIT :" + lastdigit);
System.out.println("TWO DIGIT :" + twodigit);
System.out.println("MIDDLE DIGIT :" + middledigit);
System.out.println("FIRST DIGIT :" + firstdigit);


}

}