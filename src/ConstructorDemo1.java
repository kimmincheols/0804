import java.util.Date;

public class ConstructorDemo1 {
	public static void main(String[] args) {
//		Car car = new Car();			//기본생성자라서 에러가 나지 않는다 기본생성자란 생성자가 없을때 기본적으로 만들어주기 때문에 에러가 안남
		Date now = new Date();
		System.out.println(now);
	} 
}
