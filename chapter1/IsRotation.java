public class IsRotation {

	public static boolean isRotation(String s1, String s2) {
		if (s1.length() == s2.length() && s1.length()>0) {
			String newString = s1+s1;
			return isSubstring(newString, s2);
		}
		return false;
	}
}
