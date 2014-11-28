public class IsPermutation {
	
	public static String sort(String str) {
		String strLower = str.toLowerCase();
		char[] array = strLower.toCharArray();
		java.util.Arrays.sort(array);
		String newString = new String(array);
		return newString;
	}

	public static boolean isPermutationString(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		String string1 = sort(str1);
		String string2 = sort(str2);
		System.out.println(string1);
		System.out.println(string2);
		return string1.equals(string2);
	}
	
	public static void main(String[] args) {
		System.out.println(isPermutationString("Momim", "Nimom"));
	}
}
