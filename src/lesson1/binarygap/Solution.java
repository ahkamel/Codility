package lesson1.binarygap;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution2(20));
	}

	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
		int count = 0;
		int tempCount = 0;
		char[] characters = binary.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == '0') {
				tempCount++;
			} else {
				if (tempCount > count) {
					if (i - tempCount > 0 && characters[i - tempCount - 1] == '1') {
						count = tempCount;
					}
				}
				tempCount = 0;
			}
		}
		return count;
	}

	public static int solution2(int N) {
		String binary = Integer.toBinaryString(N);
		int i = binary.length() - 1;
		while (binary.charAt(i) == '0') {
			i--;
		}
		int gap = 0;
		int counter = 0;
		for (; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				gap = Math.max(gap, counter);
				counter = 0;
			} else {
				counter++;
			}
		}
		gap = Math.max(gap, counter);
		return gap;
	}

}
