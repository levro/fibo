package com.tasks3.fibonacci;

public class Fibonacci {

	public static long getNumber(int position){
		if (position == 0)
			return 0;
		else if (position <= 2)
			return 1;
		else return getNumber(position - 1) + getNumber(position - 2); 
	}

	public static void main(String[] args) {
//		for (int i=0; i<11; i++){
		System.out.println(getNumber(35));
	}

}
