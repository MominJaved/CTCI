public class Compress {

	public static String compressString(String str) {
		String compStr = "";
		char prev = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == prev) {
				count++;
				//prev = str.charAt(i);
			}
			else {
				compStr = compStr + prev + count;
				prev = str.charAt(i);
				count = 1;	
			}
					
		}
		return compStr + prev + count;
	}

	public static void main(String[] args) {
		System.out.println(compressString("aabcccccaaa"));
	}
}
