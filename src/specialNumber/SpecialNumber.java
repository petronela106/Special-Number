package specialNumber;

import java.util.Scanner;

//Write a program to check if given number is special:
//Special numbers are divisible by all of their digits without remainder
//Read an integer and check whether it is a special number
//Print "{num} is special" if the number is special
//Otherwise, print "{num} is not special"

	public class SpecialNumber {
	   public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     int num = scanner.nextInt();
	     boolean special = true;
	     int n = num;
	     while(n != 0){
	         if(num % (n % 10) != 0){
	             special = false;
	             break;
	         }
	         n = n / 10 ;
	     }
	     if(special){
	         System.out.println(num +  " is special");
	     }else {
	         System.out.println(num +  " is not special"); 
	     }
	    }
	}
