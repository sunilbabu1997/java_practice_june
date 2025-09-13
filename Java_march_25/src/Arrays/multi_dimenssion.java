package Arrays;

public class multi_dimenssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multi dimenssional array
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
		System.out.println();
			}
			System.out.println();
		}
		// Multi dimenssional array in another way to create a object
//		int a1[][] = new int[2][3];
//		a1[0][0] = 2;
//		a1[0][1] = 4;
//		a1[0][2] = 5;
//		a1[1][0] = 3;
//		a1[1][1] = 4;
//		a1[1][2] = 7;
//
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(a1[i][j] + " ");
//
//			}
//			System.out.println();
//		}
	}

}
