package chapter2;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상수(Final)는 한번 초기화한 값을 변경할 수 없게 만들어줌 
		// = 뒤에 입력되는 값의 이름은 literal 리터럴
		final int VALUE = 0; 
		System.out.println(VALUE);
		//VALUE = 10;
		final double PI;		
		PI = 3.14;
		final int MIN_NUM = 0;
		final int MAX_NUM = 2100000000;
		final String MESSAGE = "내일은 화창한 날입니다.";
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		
	}

}
