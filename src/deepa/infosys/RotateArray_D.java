package deepa.infosys;

public class RotateArray_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		int D = 3;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int temp[] = new int[a.length];
		int temp2[] = new int[a.length];
		int newA[] = new int[a.length];

		for (int i = 0; i < D; i++) {
			temp[N - D + i] = a[i];
		}

		for (int i = 0; i < N - D; i++) {
			temp2[i] = a[D + i];
		}

		System.out.println("Elements of rotated array is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(newA[i] = temp[i] + temp2[i]);
		}
	}

}
