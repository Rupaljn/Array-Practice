package com.rakuen.array;

public class ArrayExample1 {
public static void main(String[] args) {
	int [] num = {1, 3, 5, 8, 2};
	int sum = 0;
	sum = sum+num[0];
	sum = sum+num[1];
	sum = sum+num[2];
	sum = sum+num[3];
	sum = sum+num[4];
	
	for(int i = 0; i<num.length; i++){
		
		System.out.println(num[i]);
		
	}
}
}
