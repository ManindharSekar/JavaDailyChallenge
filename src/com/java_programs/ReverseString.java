
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		char[] c = s.toCharArray();
		int length = c.length;
		int j = length - 1;
		int i = 0;
		while (i < j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}

		System.out.println(new String(c));

	}
}
