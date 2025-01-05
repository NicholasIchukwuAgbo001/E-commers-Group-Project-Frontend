import java.util.Scanner;
	public class threesideoftriangle {
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("ENTER SIDE ONE:");
int sideone = input.nextInt();

System.out.print("ENTER SIDE TWO:");
int sidetwo= input.nextInt();

System.out.print("ENTER SIDE THREE:");
int sidethree = input.nextInt();

int square = 2;
double summednumber = sideone + sidetwo + sidethree;
double svalue = summednumber / 2;
double area = svalue * (svalue - sideone) * (svalue - sidetwo) * (svalue - sidethree);
double squarednumber = area / square; 

System.out.println("SUMMED NUMBER :" + summednumber);
System.out.println("SVALUE :" + svalue);
System.out.ptintln("SUBVALUE :" + area);
System.out.println("AREA :" + squarednumber);



}

}