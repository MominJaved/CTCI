public class Compress2 {
	
	public static String compressString(String str) {
		int count = 1;
		char prev = str.charAt(0);
		StringBuffer buffer = new StringBuffer();
	
		for (int i = 1; i<str.length(); i++) {
			if (str.charAt(i) == prev) {
				count++;
			}
			else {
				buffer.append(prev);
				buffer.append(count);
				prev = str.charAt(i);
				count = 1;
			}
		}
		buffer.append(prev);
		buffer.append(count);
		String comp = buffer.toString();
		return comp;
	}

	public static void main(String[] args) {
		System.out.println(compressString("aabcccccaaa"));
	}
}
