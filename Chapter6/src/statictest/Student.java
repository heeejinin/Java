package statictest;

public class Student {
	// static : 정적인, 프로그램이 실행될 때 함께 선언, 값을 공유한다, 값이 메모리에 계속 남아있기 때문에 많이 만들면 메모리가 무거워 짐.
	// 인스턴스를 생성하지 않아도 사용할 수 있는 변수나 메서드
	// static 변수, 정적 변수
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	public int cardNum;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
		cardNum = studentID + 100;
	}
	

	// static 메서드, 정적 메서드
	public static int getSereialNum() {// get은 void랑 같이 사용 불가 그래서 int 씀
		return serialNum;
	}

	// 일반메서드 에서는 스태틱 변수를 사용할 수 있음
	public void showInfo() {
		System.out.println(serialNum+ "," + studentName);
		
	}

	// 스태틱메서드에서는 일반 멤버 변수를 사용할 수 없음
	public static void showinfo2() {
		//System.out.println(serialNum + "," + studentName);
		System.out.println(serialNum);
	}
}
