package com.practice03.ex;

public class Ex09 {
	public static void main(String[] args) {
		 int i;
		 int b;
		 int num =1;
		for(i=1; i<=10; i++) {
			
			for(b=1; b<=10; b++) {
				System.out.print(num++);
				System.out.print("\t");
			}
			num= num-9;
			System.out.println();
			
		}
			
	}
}
