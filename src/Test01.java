
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("가나다");
		String str1 = new String("가나다");
		Car bmw = new Car();
		bmw.color = "Yello";
		bmw.code = 123;
		bmw.driver = "이재오";
		bmw.drivigCar();
		System.out.println("색상 : " + bmw.color);
		System.out.println("code : " + bmw.code);
		System.out.println("운전자 : " + bmw.driver);
		Car kia = new Car();
		kia.color = "Black";
		kia.code = 121;
		kia.driver = "홍길동";
		kia.drivigCar();
		System.out.println("색상 : " + kia.color);
		System.out.println("code : " + kia.code);
		System.out.println("운전자 : " + kia.driver);
		System.out.println("bmw == kia : " + (bmw == kia));
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}

}
