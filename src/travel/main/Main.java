package travel.main;

import java.util.Scanner;
import travel.payment.PayAmount;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the size of Currency Denomination : ");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Currency Denomination values");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay :");
		int amount=sc.nextInt();		
		
		PayAmount pay=new PayAmount();
		pay.noOfNotes(arr,amount);
		sc.close();

	}

}

