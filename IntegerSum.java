package java1;
import java.util.Scanner;
public class IntegerSum{
	public static void main(String args[]){
		System.out.println("enter  -1 to stop entering the number else continue entering ");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String num = sc.nextInt();
		
		while(num != -1){
			sum = sum + num;
			num = sc.nextInt();
			
		}
		System.out.println("the sum of all the integer is:" + " "+sum);
	}
}