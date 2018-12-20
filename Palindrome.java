package javaassignment;
import java.util.Scanner;

public class Palindrome{
	public static void main(String args[]){
		System.out.println("---enter the number for which you want to check for palindrome---");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int rem = 0;
		 
		while(num > 0) {
			rem = num % 10;
			sum = sum*10 + rem;
			num= num/10;
		}
		if(temp == sum){
			System.out.println("it is a palindrome");
			int r =0;
			int s = 0;
			while(temp > 0){
				r= temp%10;
				temp = temp/10;
				if(r%2==0){
					s=s+r;
				}		
			}
			if(s > 25)
				System.out.println("the sum for the number is greater than 25");
			else
				System.out.println("the sum for the number is not greater than 25");
		}else{
			System.out.println("it is not a palindrome");
		}
			
		
			
	}

}