package java1;
import java.util.Scanner;
public class Reverse{
	public static void main(String args[]){
		System.out.println("enter the string you want to reverse...");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		/*char a[] = word.toCharArray();
		int l = a.length;
		for(int i=l-1;i>=0;i--){
			System.out.print(a[i]);
		}*/
		
		String reverse =" ";
		int len = word.length();
		for(int i=len-1;i>=0;i--){
			reverse = reverse + word.charAt(i);
		}
		System.out.print(reverse);
		
	}
}