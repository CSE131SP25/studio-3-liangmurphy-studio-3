package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Pick a number");
		int n = in.nextInt();
		boolean[] trueFalseList = new boolean[n+1];
		for (int i = 0; i<trueFalseList.length; i++){
			trueFalseList[i] = true;
		}
		for (int i = 2; i < trueFalseList.length; i++) {
			for (int j = i + i; j < n; j = j + i) {
				trueFalseList[j] = false;
			}
			
		}
		for (int i = 2; i<trueFalseList.length; i++){
			if (trueFalseList[i] == true) {
				System.out.println(i);
				
			}
		}

	}

}
