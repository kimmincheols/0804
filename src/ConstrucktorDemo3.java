/*
 * this()를 사용할 거라면 new 없이 생성자를 호출하기 위한 메소드
 * 1. 반드시 생성자메소드에서만 사용해야하고
 * 2. 생성자 메소드내의 반드시 첫번째 줄에 와야한다.
 */

public class ConstrucktorDemo3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon();
		System.out.println(jimin.name);
		System.out.println(jimin.salary);

	}
}

class Sawon {
	String name;
	int salary;

	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Sawon(String name) {
		this(name, 5000);
//		this.name = name;
//		new Sawon(name, 50000);
	}

	public Sawon(int salary) {
		this("Unknown", salary);
//		this.salary = salary;
//		new Sawon("Unknown", salary);
	}

	public Sawon() {
		this("Unknown", 500000);
//		new Sawon("Unknon", 500000);
	}
}