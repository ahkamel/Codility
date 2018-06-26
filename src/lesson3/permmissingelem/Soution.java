package lesson3.permmissingelem;

public class Soution {

	private int solution(int[] A) {
		int sum = 0;
		int totalSum = (A.length) + 1;
		for (int i = 1; i <= A.length; i++) {
			sum += A[i - 1];
			totalSum += i;
		}
		System.out.println(totalSum);
		System.out.println(sum);
		return totalSum - sum;
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		System.out.println(new Soution().solution(A));
	}
}
