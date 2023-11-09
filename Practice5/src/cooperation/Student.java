package cooperation;

public class Student {
	public String studentName; // 멤버변수
	public int grade; //?
	public int money;

	public Student(String studentName, int money) {// 매개변수
		this.studentName = studentName;
		this.money = money;

	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	public void takesubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void taketaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-= 10000;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 돈은"+money+"입니다.");
	}
}
