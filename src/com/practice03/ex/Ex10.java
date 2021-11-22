package com.practice03.ex;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("숫자 5개를 입력하세요.");
		  int[] arr = new int[5];
		  int max = 0;
		  
		  //length는 갯수
		  for(int i=0; i<arr.length; i++){
			  
			  arr[i] = sc.nextInt(); //입력받은 수를 배열에 저장
			   System.out.println("숫자"); //입력 후 다음 수 선언
			   

			   if(arr[max]<arr[i]){
			    max=i; // arr[i]보다 작을때 max를 i로 전환 변환
			    
			   }

		  }
		  System.out.println("최대값 " + arr[max]);
		   sc.close();
}
		
}
		  

