package com.test2;

import java.util.Scanner;

public class PrintMatrics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row : ");
		int row = sc.nextInt();
		System.out.println("Enter size of column : ");
		int column = sc.nextInt();
		int matrics[][] = new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrics[i][j] = sc.nextInt();
			}
		}
		
		for(int [] rowMatrics :matrics) {
			for(int columnMatrics : rowMatrics ) {
				System.out.print(columnMatrics+" ");
			}
			System.out.println();
		}

	}

}
