package java1;
import java.util.Scanner;
public class Sorting{
	
	public static void sorting(int a[] , int l){
		int temp;
		for(int i=0;i<l-1;i++){
			for(int j=0;j<l-i-1;j++){
				if(a[j] < a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("sorted number in non-increasing order is: ");
		for(int i=0;i<l;i++){
			System.out.print(a[i] + " ");
		}
		
	}
	
	
	public static boolean sumEven(int a[], int l){
			int sum = 0;
			for(int i=0;i<l;i++){
				if(a[i]%2==0){
					sum = sum + a[i];
				}
			}
			if(sum > 15)
				return true;
			else
				return false;
		}
		
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("the elements of the array are:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		sorting(arr, arr.length);
		System.out.println(sumEven(arr, n));
		
	}
}