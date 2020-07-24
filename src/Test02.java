import java.util.Scanner;

public class Test02 {
	static Scanner sc = new Scanner(System.in);

	public static void power(int b, int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			sum *= b;
		}
		System.out.println(sum);
	}

	public static String gugudan(int N) {
		int i;
		System.out.println(N + " 단");
		System.out.println();
		for (i = 1; i <= 9; i++) {
			System.out.println(N + " X " + i + " = " + N * i);
		}
//		System.out.print("\n피승수 입력 : ");
//		int a = sc.nextInt();
//		System.out.print("승수 입력 : ");
//		int b = sc.nextInt();
//		power(a, b);
		return "\n리턴문 :" + N + " X " + i + " = " + N * i;
	}

	public static void main(String[] args) {
		System.out.print("Input : ");
		int Num = sc.nextInt();
		System.out.println();
		String result = gugudan(Num);
		System.out.println(result);

		sc.close();
	}

}
