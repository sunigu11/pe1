package java1;
import java.util.Scanner;
public class PartReverse{
	public static void main(String args[]){
		System.out.println("enter the string:");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		System.out.println("enter the number of character you want to reverse");
		int input2 = sc.nextInt();
		int len = input1.length();
		String extra = " ";
		for(int j=1;j<=input2;j++){
			for(int i=len-input2;i<len;i++){
				extra = extra + input1.charAt(i);
				}
		}
		System.out.println(input1 + extra);
	}
}