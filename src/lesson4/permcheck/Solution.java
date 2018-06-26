package lesson4.permcheck;

public class Solution {

	
	 private int solution(int[] A) {
		 
		 /*int[] temp = new int[A.length+1];
		 for (int i = 0; i < A.length; i++) {
			temp[A[i]-1] = A[i];
		}*/
		 boolean[] seen = new boolean[A.length + 1];
		 for (int i = 0; i < A.length; i++) {
			if(A[i] >A.length) {
				return 0;
			}
			if(seen[A[i]] == true) return 0;
			else seen[A[i]] = true;
		}
		 return 1;
	 }
	 
	 public static void main(String[] args) {
		int[] A = {4,1,3,2};
		System.out.println(new Solution().solution(A ));
	}
}
