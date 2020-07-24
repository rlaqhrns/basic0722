
public class Array02 {

	public static void main(String[] args) {

		String[] scores = { "全辨悼", "辫俺端", "辫富磊", "全富磊", "全家端" };
		String[] scores_copy = new String[5];
		int[] c = { 1, 2, 3, 4, 5, 6 };
		int[] d = new int[6];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}

		for (int i = 0; i < scores_copy.length; i++) {
			scores_copy[i] = scores[i] + (2 * i + 1);
		}
		System.out.println();
		for (int i = 0; i < scores_copy.length; i++) {
			System.out.println("scores1[" + i + "] : " + scores_copy[i]);
		}
		System.out.println();
		for (int n : c) {
			System.out.println("c X 10 = " + n * 10);
		}
		int i = 0;
		for (int n : c) {
			d[i++] = n * 5;
		} 
		System.out.println();
		for (int n : d) {
			System.out.println("d : " + n);
		}

	}

}
