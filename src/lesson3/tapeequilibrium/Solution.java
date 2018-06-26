package lesson3.tapeequilibrium;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private int solution(int[] A) {
		long sumright = 0;
		long sumleft = 0;
		long ans;
		for (int i = 1; i < A.length; i++) {
			sumright += A[i];
		}

		sumleft = A[0];
		ans = Math.abs(sumright - sumleft);

		for (int P = 1; P < A.length; P++) {
			if (Math.abs(sumleft - sumright) < ans)
				ans = Math.abs(sumleft - sumright);
			sumleft += A[P];
			sumright -= A[P];
		}
		return (int) ans;
	}

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3 };
		System.out.println(new Solution().solution(A));
	}
}
