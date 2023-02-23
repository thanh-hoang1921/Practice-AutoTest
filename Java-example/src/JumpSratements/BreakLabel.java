package JumpSratements;

public class BreakLabel {
	public static void main(String[] args) {
		label_1: {
			label_2: {
				label_3: {
					for (int i = 0; i < 100; i++) {
						System.out.println("i = " + i + " - Inside Label_3");
						if (i == 3)
//							break;
							break label_2;
					}
				}
				System.out.println("Inside Label_2");
			}
			System.out.println("Inside Label_1");
		}

		// Ví dụ: break statement GOTO
//		int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
//		boolean found = false;
//		int row = 0;
//		int col = 0;
//
//		// find index of first int greater than 10
//		searchint:
//
//		for (row = 0; row < arr.length; row++) {
//			for (col = 0; col < arr[row].length; col++) {
//				if (arr[row][col] > 10) {
//					found = true;
//					break searchint;
//				}
//			}
//		}
//		if (found)
//			System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");

	}

}
