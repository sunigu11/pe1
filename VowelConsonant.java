package java1;
import java.util.Scanner;
public class VowelConsonant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String word = sc.nextLine().toLowerCase();
		char arr[] = word.toCharArray();
		/*for(int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				 System.out.print("vowel" + " ");
			}
			else if(arr[i] == 0 || arr[i] == 1 || arr[i] == 2 || arr[i] == 3 || arr[i] ==  )
				System.out.print("consonant" + " ");
		}
		*/
		
		
		for(int i=0;i<arr.length;i++){
			switch(arr[i]){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.print("vowel" + " ");
					break;
				case 'b':
				case 'c':
				case 'd':
				case 'f':
				case 'g':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					System.out.print("consonant" + "  ");
					break;
				default:
					System.out.println("error");
			}
		}
	}
}