package com.gl.main;

import java.util.Scanner;

import com.gl.transaction.Transaction;

public class Main {

	public static void main(String[] arge) {
		
			Transaction transaction = new Transaction();
			
			Scanner scanner = new Scanner(System.in);
			
			int noOfDenomination;
			System.out.println("Enter the size of currency denominations");
			noOfDenomination = scanner.nextInt();
			System.out.print("Enter the currency denomination value");
			int valueOfDenomination;
			int[] array = new int[noOfDenomination];
			
			for(int i = 0; i < noOfDenomination; i++) {
				array[i] = scanner.nextInt();
			}
			
			System.out.println("Enter the amount you want to pay");
			int amount = scanner.nextInt();
			transaction.bubbleSort(array);
			transaction.noOfNotes(array,amount);
		}
}
