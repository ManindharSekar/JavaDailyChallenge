
public class ReverseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7,3,9,4,1,5,99,33};
		int j = a.length - 1;
		int i=0;
	
			while(i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			i++;
			j--;
		}
			for(int num: a) {
				System.out.print(num+" ");
			}

	}

}
