package com.revature;

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
			
			int numberOfOccurences = 0;		
			int currentNumber = 0;
			
			for(int index = 0;index < data.length;index++) {
				currentNumber = data[index];
				for(int index2 = 1; index2 < data.length;index2++) {
					if(currentNumber == data[index2]) {
						numberOfOccurences++;
						if(numberOfOccurences > n) {
							for(int index3 = 0;index3 < data.length; index3++) {
								if(data[index3] == currentNumber) {
									data = ArrayUtils.remove(data, index3);
								}
							}
						}
					}
				}
				numberOfOccurences = 0;
			}
		}
		
		
		return data;
	}

}
