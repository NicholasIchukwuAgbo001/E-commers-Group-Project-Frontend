import java.util.Scanner;
      
      public class Squarecube{
          
             public static void main(String[] args){

               Scanner input = new Scanner(System.in);
         
       int number = 0;
       int square = 0;
       int cube = 0;

	System.out.println("number"    +    "square" +   "cube");
          
       
    for(number = 0; number <=5; number++){
   square = number * number;
  cube = number * number * number;


  System.out.println(number  +"       " + square + "      " +   cube);

}

}

}