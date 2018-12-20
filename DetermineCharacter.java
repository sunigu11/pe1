package java1;
import java.util.Scanner;
public class DetermineCharacter{
	public static void main(String args[]){
		System.out.println("enter the character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
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
				System.out.println("small case letter");
				break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				System.out.println("upper case alphabet");
				break;
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '0':
				System.out.println("it is number");
				break;
			default:
				System.out.println("it is a special Symbol");
				break;
			
		}
	}
}