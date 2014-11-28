public class IsPermutation2 {

	public static boolean isPermutationString(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		int[] intArray = new int[256];
		char[] charArray = str1.toCharArray();
		for (char c : charArray) {
			intArray[c]++;
		}

		for (int i=0; i<str2.length(); i++) {
			int value = str2.charAt(i);
			intArray[value]--;
			if (intArray[value] < 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPermutationString("momin", "nimom"));
	}
}
