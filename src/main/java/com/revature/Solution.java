package com.revature;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Solution {

	/**
	 * Implement the method below, then right click on
	 * SolutionTests.java within src/test/java/ -> com.revature to test your code
	 * before committing and pushing to your repository.
	 */
	
	public static int[] solution(int[] data, int n) {
		
		if(data.length > 100) {
			System.exit(0);
		}else {
			
			if(n == 0) {
				
				data = new int[0];
				
			}else {
				int numberOfOccurences = 0;		
				int currentNumber = 0;
				
				for(int index = 0;index < data.length;index++) {
					currentNumber = data[index];
					for(int index2 = 0; index2 < data.length;index2++) {
						if(currentNumber == data[index2]) {
							numberOfOccurences++;
							if(numberOfOccurences > n) {
								int tempNum = currentNumber;
								data = Arrays.stream(data).filter(x -> x != tempNum).toArray();
							}
						}
					}
					numberOfOccurences = 0;
				}
			}
			
		}
		
		
		return data;
	}

}
