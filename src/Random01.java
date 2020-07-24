
public class Random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		i = 1;
		do {
			System.out.println(i++);
			
		} while (i <= 5);
		System.out.println();
		i=1;
		do {
			System.out.println(++i);
			
		} while (i <= 5);
	}
}
