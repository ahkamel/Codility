package lesson2.oddoccurrencesinarray;

import java.util.HashSet;

public class Solution {

	private int solution(int[] A) {

		for (int i = 0; i < A.length; i++) {
			boolean founded = false;
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j] && i != j) {
					founded = true;
					break;
				}
			}
			if (!founded)
				return A[i];
		}
		return -1;
	}

	private int solution2(int[] A) {
		int elem = 0;
		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
	}

	private int solution3(int[] A) {
		HashSet<Integer> dups = new HashSet<Integer>();
		int elem = -1;
		for (int i = 0; i < A.length; i++) {
			if (dups.add(A[i])) {
				elem = A[i];
			}
		}
		return elem;
	}

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 9, 7, 7, 9, 5, 5 };
		System.out.println(new Solution().solution3(A));
	}
}
