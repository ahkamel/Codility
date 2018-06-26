package lesson3.frogjmp;

public class Solution {
	
	private int solution(int X, int Y, int D) {
		return (int)Math.ceil((Y-X)/Double.valueOf(D));
	}
	
	
	public static void main(String[] args) {
		System.out.println(new Solution().solution(10, 85, 30));
	}

}
