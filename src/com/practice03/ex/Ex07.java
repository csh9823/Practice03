package com.practice03.ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int b;
		int d;
		System.out.println("숫자를 입력하세요");
		d = sc.nextInt();
		
		for(i=1; i<=d; i++) {
			
			for(b=1; b<=i; b++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}
	
}
