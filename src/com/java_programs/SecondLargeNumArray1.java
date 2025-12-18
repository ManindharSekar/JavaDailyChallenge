
public class SecondLargeNumArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 3, 9, 4, 1, 5, 99, 33 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		System.out.print("The Second Lagest Number of Array is: " + a[a.length - 2]);

	}

}
