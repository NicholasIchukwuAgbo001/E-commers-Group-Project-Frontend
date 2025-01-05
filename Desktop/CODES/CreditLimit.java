import java.util.Scanner;
 	public class CreditLimit {

	public static void main(String[] args) {

	Scanner input =  new Scanner(System.in);
	System.out.println("ACCOUNT NUMBER : ");
	int accountnumber = input.nextInt();

		System.out.println("BALANCE AT THE BIGINNING OF THE MONTH : ");
	int beginningbalance = input.nextInt();

		System.out.println("TOTAL OF ITEM CHARGED THIS MONTH : ");
	int itemcharged = input.nextInt();

		System.out.println("TOTAL OF ALL CREDIT APPLIED THIS MONTH : ");
	int creditapplied = input.nextInt();

		System.out.println("ALLOWED CREDIT LIMIT : ");
	int creditlimit = input.nextInt();

	int newbalance = beginningbalance + itemcharged - creditapplied;
	System.out.println("NEW BALANCE : " +newbalance);

if(newbalance >= creditlimit) {
	System.out.println("CREDIT LIMIT EXCEEDED");
}else{
	System.out.println("CREDIT LIMIT NOT EXCEEDED");
}

}

}