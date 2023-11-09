package thistest;
class BirthDay{
	int day;
	int month;
	int year;
	
	public BirthDay() {
		//this() : 자신의 생성자를 불러오는 역할
		this(9,11,2023); //this(9,11,2023); = BirthDay(2023,11,9); 
						//생성자는 여러번 부를 수 없다 => 기존에 입력한 값 :this(9,11,2023);이 기본값이 되는데, 생성자를 여러번 부르면 기본값이 여러개 되니까 컴파일러가 걸러주는 것임.
						//this.(9,11);
		
	}
	public BirthDay(int day, int month) {
		this.day= day;
		this.month= month;
		
	}
	public BirthDay(int day, int month, int year) {//매개변수
		//this.멤버변수 : 자기자신 안에 멤버변수를 불러오는 역할
		this.day = day;
		this.month = month;
		this.year = year;
		//this.메서드 : 자신의 안에 있는 메서드를 불러오는 역할
		System.out.println(this.getDay());
		this.setDay(day);
	}
	
	
	public BirthDay returnItSelf() {
		return this;
	}
	
	public void showBirthDayInfo() {
		System.out.println(year + "/" +month +"/" +day);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 만드는 방법 : class명 인스턴스 = new class명
		BirthDay kim =new BirthDay(); // kim = 인스턴스
		kim.showBirthDayInfo();
		//BirthDay kim2 = kim.returnItSelf(); : 하기와 같은 의미
		BirthDay kim2 = new BirthDay(kim.getDay(), kim.getMonth(), kim.getYear());
		kim2.showBirthDayInfo();
		
		kim.setYear(2000);
		
		kim.showBirthDayInfo();
		kim2.showBirthDayInfo();
		
		kim2.setYear(1900);
		kim.showBirthDayInfo();
		kim2.showBirthDayInfo();
		
		
		System.out.println(kim);
		System.out.println(kim2);
	}

}
