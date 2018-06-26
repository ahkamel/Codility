package lesson2.cyclicrotation;

import java.util.Arrays;

public class Solution {
	private int[] solution(int A[], int N, int K) {

		if (A.length > 0) {
			for (int j = 0; j < K; j++) {
				int temp = A[A.length - 1];
				for (int i = A.length - 1; i > 0; i--) {
					A[i] = A[i - 1];
				}
				A[0] = temp;
			}
			return A;
		} else {
			return A;
		}

	}

	public static void main(String[] args) {
		int[] A = { 3, 8, 9, 7, 6 };
		int N = 5;
		int K = 3;
		System.out.println(Arrays.toString(new Solution().solution(A, N, K)));
	}
}
