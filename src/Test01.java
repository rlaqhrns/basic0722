
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("������");
		String str1 = new String("������");
		Car bmw = new Car();
		bmw.color = "Yello";
		bmw.code = 123;
		bmw.driver = "�����";
		bmw.drivigCar();
		System.out.println("���� : " + bmw.color);
		System.out.println("code : " + bmw.code);
		System.out.println("������ : " + bmw.driver);
		Car kia = new Car();
		kia.color = "Black";
		kia.code = 121;
		kia.driver = "ȫ�浿";
		kia.drivigCar();
		System.out.println("���� : " + kia.color);
		System.out.println("code : " + kia.code);
		System.out.println("������ : " + kia.driver);
		System.out.println("bmw == kia : " + (bmw == kia));
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}

}
