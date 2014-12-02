public class Compress2 {

	public static String compressString(String str) {
		if (compLength(str) > str.length())
			return str;
		int count = 1;
		char prev = str.charAt(0);
		StringBuffer buffer = new StringBuffer();
	
		for (int i = 1; i < str.length(); i++) {
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

	public static int compLength(String string) {
		if (string == null || string.isEmpty())
			return 0;
		char last = string.charAt(0);
		int count = 1;
		int len = 0;
		for (int j = 1; j <string.length(); j++) {
			if (string.charAt(j) == last) {
				count++;
			}
			else {
				len += 1 + String.valueOf(count).length();
				last = string.charAt(j);
				count = 1;
			}
		}
		len += 1 + String.valueOf(count).length();
		//System.out.println(len);
		return len;
	}

	public static void main(String[] args) {
                System.out.println(compressString("abcdefg"));
        } 
}
