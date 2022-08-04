
public class Car {
	private String name;
	private int price;
	
	
	public Car() {				//기본 생성자 <- 컴파일러가 자동으로 생성해주는것, 괄호안에 아무것도 없어야댐ㅋ
		System.out.println("방금 객체가 생성되었습니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void myPrint() {
		System.out.println(this);
	}
	
	
	
//	private String name;
//	private int price;
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getName(){
//		return name;
//	}
//	public int getPrice() {
//		return price;
//	}
}
