import java.util.Scanner;
public class BankApp {
	public static void main(String[] bankapp) {
	
	System.out.println("Hello sir/ma welcome..... please select an option ");

	System.out.printf("\n1. deposit,\n2. withdraw, \n3. account settings.");

	Scanner userinput = new Scanner(System.in);

	int deposit = userinput.nextInt();
switch(deposit) {
	case 1: System.out.println("DEPOSIT");
System.out.println("""
		1. deposit into account....
		2. deposit history....
"""); System.out.println("loading......");

	int deposits = userinput.nextInt();
switch(deposits) {
	case 1: System.out.println("deposit into account");
System.out.println("""
		1. Enter bank name___________________________
		2. Enter bank account_________________________________
		3. Enter amount______________________________________

""");
System.out.println("loading........");


	int sample = userinput.nextInt();
switch(sample) {
	case 2: System.out.println("deposit history");
System.out.println("""
	1. download bank hiatory
	2. spent $5000000 this month
"""); System.out.println("loading.........");
break;}
break;
}
}
}


}
}


}