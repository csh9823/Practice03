package com.practice03.ex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<=1; i++) {
			
			for(int b=1; b<=num; b++) {
				sum=sum+b;
				System.out.print(b);
				if(b==num) { 
				System.out.print("=");
				System.out.print(sum);
				}
				else {
					System.out.print("+");
				}
				
			}
		}
		sc.close();
	}

}

