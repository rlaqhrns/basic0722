public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = 2 * (i + 1);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
		System.out.println();

		int i = 0;
		do {
			System.out.println("score[" + i + "] : " + score[i++]);
		} while (i < 5);
		System.out.println();
		i = 0;
		while (i < 5) {

			System.out.println("score[" + i + "] : " + score[i++]);
		}
	}

}
