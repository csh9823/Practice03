package com.practice03.ex;

public class Ex08 {
		public static void main(String[] args) {
			
			int dan;
			int i;
			
			for( i =1; i<=9; i++) { //줄관여
				
				for(dan=2; dan<=9; dan++) { //중가 관여
					
					System.out.print(dan+"*"+i+"="+dan*i);	
					System.out.print("\t");
				}
				System.out.println();
			}
	    }
	}