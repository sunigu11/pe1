package java1;
import java.util.Scanner;
public class OddEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer number");
		int num = sc.nextInt();
		if((num%2==0) && (num > 20) && (num < 30)){
			System.out.println("jerry");
		}
		else if((num%2!=0) && (num > 20) && (num < 30)){
			System.out.println("tom");
		}else
			System.out.println("number is not in the specified range");
		
	}
}