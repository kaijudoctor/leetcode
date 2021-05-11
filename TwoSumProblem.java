package com.example.practice;

import java.util.HashMap;
public class TwoSumProblem {
	
	/**
	 * This problem can be solved in multiple ways - 
	 * 1. Run two loops and check if nums[i]+nums[j]==target --> O(n) = n^2
	 * 2. Sort the array and then run the loop from left and from the right and then check if the sum reaches target, if not check if the sum is lesser than the target then increment left pointer
	 * 	  else if the sum is greater than the target decrement the right pointer --> O(n) = n log n
	 * 3. Use a hashmap as below to store the difference and then check the sum --> O(n) = n 
	 * 	  Run time increases linearly with the size of the input
	 */
	
	private static int nums [] = {5,9,2,40,8,16,13,22};
	private static HashMap<Integer,Integer> hashmap = new HashMap<>();
	private static int target = 18;
	private static int compliment;
	
	public static void main(String args[]) {
		for(int i=0;i<nums.length;i++) {  // iterate over the full array
			compliment = target - nums[i]; // get the difference between the target int and present ith location.
				if(hashmap.containsKey(compliment))  {// check if the compliment already exists in the map
					System.out.printf("The two numbers are : %d %d %n",compliment,nums[i]); //if yes we found two numbers that add to the target
					System.out.printf("Indices are : %d %d %n",hashmap.get(compliment),i);
				}
				else {
						hashmap.put(nums[i], i);  //else put the number in the hashmap
				}
			}
		}
	}
