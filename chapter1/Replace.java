public class Replace {

	public static String replaceString(String str, int len) {
		int spaceCount = 0;
		char[] array = str.toCharArray();
		for (int i=0; i<len; i++) {
			if (array[i] == ' ')
				spaceCount++;
		}
		
		int newLen = len + (2*spaceCount);

		for (int i=len-1; i>=0; i--) {
			if (array[i] != ' ') {
				array[newLen-1] = array[i];
				newLen--;
			}
			else {
				array[newLen-1] = '0';
				array[newLen-2] = '2';
				array[newLen-3] = '%';
				newLen = newLen-3;
			}
		}
		String replaced = new String(array);
		return replaced;
	}

	public static void main(String[] args) {
		System.out.println(replaceString("Marry had a little lamb.        ", 24));
	}
}
		
