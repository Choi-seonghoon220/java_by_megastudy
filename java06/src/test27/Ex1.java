package test27;

public class Ex1 {

	public static void main(String[] args) {
		int[] data = { 4, 5, 6, 7, 9, 2, 4, 6, 5, 10 };
		int t, n = 10;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (data[i] > data[j]) {
					t = data[i];
					data[i] = data[j];
					data[j] = t;
					
				}
			}
			for (int k : data) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
