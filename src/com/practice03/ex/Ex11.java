package com.practice03.ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		int sum2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			if(i%2==0) {
				sum = sum+i;
			}
			else {
				sum2 = sum2+i;
			}
		}
		System.out.print("결과값: "+sum);
		sc.close();
	}
}
			



