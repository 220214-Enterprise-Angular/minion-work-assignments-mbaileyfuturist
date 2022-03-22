package com.revature.main;

import com.revature.Solution;

public class Driver {

	public static void main(String[] args) {
				
		int[] data = { 5, 10, 15, 10, 34, 5, 5, 10, 15, 7, 1, 15 };
		Solution s = new Solution();

		int[] filteredArray = s.solution(data, 2);
		
		for(int index = 0; index < filteredArray.length; index++) {
			System.out.println(filteredArray[index]);
		}
	}
}
