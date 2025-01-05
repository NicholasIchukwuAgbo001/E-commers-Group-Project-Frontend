import java.util.Scanner;
	public class Nokia3310 {
	public static void main(String[] nokia){

	Scanner userinput = new Scanner(System.in);
	System.out.println("WELCOME TO NOKIA ");
System.out.println("""
	1. Phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games 
	9. Calculator
	10. Reminders
	11. Clock
	12. Profile
	13. SIM services
""");
	System.out.println("please select option");

	int phonebook = userinput.nextInt();
switch(phonebook) {
	case 1: System.out.println("PHONE BOOK");

System.out.println("""

	1. Search
	2. Services Nos
	3. Add name
	4. Erase
	5. Edit
	6. Assign tone
	7. Send b'card
	8. Option
	9. Speed dails
	10. Voice tags

 """);

int option = userinput.nextInt();
switch(switch) {
	 case 1: System.out.println("switch");

         System.out.println(""" 
         
          1. Start searching...

""");

break;

	        case 2: System.out.println(""" 
         
          1. Searching services nos....

""");
break;

		      case 3: System.out.println(""" 
         
        	  1. Enter name....

""");
break;

			case 4: System.out.println("""

			1. clear all...
""");
break;

			case 5: System.out.println("""
	
			1. Edit text....
""");
break;

			case 6: System.out.println("""

			1. Tone 1
			2. Tone 2
			3. Tone 3
""");
break;

			case 7: System.out.println("""
	
			1. Edit b'card....
""");
break;

			case 8: System.out.println("""
	
			1. Type of view
			2. Memory status
""");
break;

			case 9: System.out.println("""
	
			1. dailing....
""");
break;

			case 10: System.out.println("""
	
			1. voice 1
			2. voice 2
			3. voice 3
""");
break;
}

	break; 

	case 2: System.out.println("MESSAGES");
System.out.println("""

	1. Write messages
	2. Inbox
	3. Outbox
	4. Picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service
	9. Voice mailbox number
	10. Service command editor

 """);

int option2 = userinput.nextInt();
switch(option2) {
	 case 1: System.out.println("option2");

         System.out.println(""" 
         
          1. enter message...

""");
break;
	       case 2: System.out.println(""" 
         
          1. inbox messages

""");
break;

	      case 3: System.out.println(""" 
         
          1. outbox message

""");
break;

      		case 4: System.out.println(""" 
         
          1. enter picture message

""");
break;
		 case 5:  System.out.println(""" 
         
          1. new template

""");
break;

		 case 6:  System.out.println(""" 
         
          1. smiley options

""");
break;

		 case 7:  System.out.println(""" 
         
          1. set 1
	  2. common
""");
break;

		 case 8:  System.out.println(""" 
         
          1. more info services

""");
break;
	
	 case 9:  System.out.println(""" 
         
          1. new voice mailbox

""");
break;

	 case 10:  System.out.println(""" 
         
          1. edit new service command

""");
break;

}
	break;  
	case 3: System.out.println("CHAT");
System.out.println("""

	1. chat 


""");

	int option3 = userinput.nextInt();
switch(option3) {
	 case 1: System.out.println("option3");

         System.out.println(""" 
         
          1. start new chat...

""");
break;
}

break;

	case 4: System.out.println("Call register");
System.out.println("""

	1. Missed calls
	2. Received calls
	3. Dialed numbers
	4. Erase recent call lists
	5. Show call duration
	6. Show call costs
	7. Call cost settings
	8. Prepaid credit

""");

	int option4 = userinput.nextInt();
switch(option4) {
	 case 1: System.out.println("option4");

         System.out.println(""" 
         
          1. missed call 1
	  2. missed call 2

""");
break;

	 case 2: System.out.println(""" 
         
          1. recieved call 1
	  2. recieved call 2

""");
break;

		 case 3: System.out.println(""" 
         
          1. dialed number 1
	  2. dialed number 2

""");
break;

		 case 4: System.out.println(""" 
         
          1. clear recent call 1
	  2. clear recent call 2

""");
break;

		 case 5: System.out.println(""" 
         
          1. last call duration
	  2. all calls'cost
	  3. received calls'duration
	  4. dialled calls'duration
	  5. clear timers

""");
break;

		 case 6: System.out.println(""" 
         
          1. last call cost
	  2. all calls'cost
	  3. clear counters

""");
break;

	 case 7: System.out.println(""" 
         
          1. call cost limit
	  2. show costs in

""");
break;

	 case 8: System.out.println(""" 
         
          1. recharge pre_paid credit

""");
break;


}
	break;

	case 5: System.out.println("Tones");
System.out.println("""

	1. Ringing tones
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver

""");

	int option5 = userinput.nextInt();
switch(option5) {
	 case 1: System.out.println("option5");

         System.out.println(""" 
         
          1. ring tone 1
	  2. ring tone 2

""");
break;

	 case 2: System.out.println(""" 
         
          1. ring volume 1
	  2. ring volume 2

""");
break;

	 case 3: System.out.println(""" 
         
          1. income call alert 1
	  2. income call alert 2

""");
break;

	 case 4: System.out.println(""" 
         
          1. new composer

""");
break;

	 case 5: System.out.println(""" 
         
          1. message alert tone 1
	  2. message alert tone 2

""");
break;

	 case 6: System.out.println(""" 
         
          1. keypad tone 1
	  2. keypad tone 2

""");
break;

	 case 7: System.out.println(""" 
         
          1. warning tone 1
	  2. warning tone 2
	  3. gaming tone 1
	  4. gaming tone 2

""");
break;

	 case 8: System.out.println(""" 
         
          1. on/off vibrate alert 
	 

""");
break;

	 case 9: System.out.println(""" 
         
          1. screen saver 1
	  2. screen saver 2

""");
break;


}
	break;

	case 6: System.out.println("Settings");
System.out.println("""

	1. Call settings
	2. Phone setttings
	3. Security settings
	4. Restore factory settings

""");

	int callsettings = userinput.nextInt();
switch(callsettings) {
	 case 1: System.out.println("callsettings");

         System.out.println(""" 
         
          1. automatic redial
	  2. speed dailing
	  3. call waaiting options
	  4. own number sending
	  5. phone line in use
	  6. automatic answer
""");
break;
        case 2: System.out.println(""" 
         
          1. language
	  2. cell info display
	  3. welcome note
	  4. network selection
	  5. lights
	  6. confirm SIM service actions

""");
break;

        case 3: System.out.println(""" 
         
          1. PIN code request
	  2. call barring service
	  3. fixed dailing
	  4. closed user group
	  5. phone security
	  6. change access codes

""");
break;

         case 4: System.out.println(""" 
         
          1. full Factory reset

""");
break;

}
	break;

	case 7: System.out.println("Call divert");
System.out.println("""

	1. Call divert

""");
	break;

	case 8: System.out.println("games");
System.out.println("""
	
	1. Games

""");
        break;

	case 9: System.out.println("Calculator");
System.out.println("""
	
	1. Calculator

""");
	break;
	
	case 10: System.out.println("Reminders");
System.out.println("""

	1. Reminders

""");
	break;

	case 11: System.out.println("Clock");
System.out.println("""

	1. Alarm clock
	2. Clock settings
	3. Date settings
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time 

""");

	break;

	case 12: System.out.println("Profiles");
System.out.println("""

	1. Profiles

""");
	break;

	case 13: System.out.println("SIM services");
System.out.println("""

	1. SIM services
""");
	break;


}
}
}