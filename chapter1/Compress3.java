public class Compress3 {

	public static int setArray(char[] array, char prev, int count, int index) {
		array[index] = prev;
		index++;
		
		char[] cnt = String.valueOf(count).toCharArray();
		for (char c : cnt) {
			array[index] = c;
			index++;
		}
		return index;
	}

	public static String compressString(String str) {
		int size = compLength(str);
		if (size > str.length())
			return str;
		
		int index = 0;
		int count = 1;
		char prev = str.charAt(0);
		char[] arr = new char[size];
	
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == prev) {
				count++;
			}
			else {
				index = setArray(arr, prev, count, index); 
				prev = str.charAt(i);
				count = 1;
			}
		}
		setArray(arr, prev, count, index);
		String comp = new String(arr);
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
                System.out.println(compressString("aabcccccaaa"));
        } 
}
