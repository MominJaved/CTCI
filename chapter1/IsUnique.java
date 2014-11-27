public class IsUnique {
	
	public static boolean isUniqueString (String text) {
		//text = text.toLowerCase();
		int len = text.length();
		if (len > 128) 
			return false;
		boolean[] array = new boolean[256];

		for (int i=0; i<len; i++) {
			int value = text.charAt(i);
			if (array[value])
				return false;
			array[value] = true;
		}
		return true;
	}

	public static void main (String[] args) {
		boolean bool = isUniqueString("Momin");
		System.out.println(bool);
	}
}
