package mydate;

public class MyDate {
//MyDate 클래스 완성하기
// 1. year, month, date 변수를 private으로 선언
// 2. 각 변수의 get, set 메서드를 public으로 작성
// 3. MyDate(int year, int month, int day)생성자를 작성
// 4. isValid() : 메서드를 만들어 날짜가 정상인지 판단하는 메서드(isValid라는 이름) 작성
//=>결과값으로 String ->2월은 30일이 없음 =>유효하지 않은 날짜입니다.
//유효한 날짜입니다.

	private int year; // 1. 멤버변수(class 밑에 있는 변수를 의미함)
	private int month;
	private int day; // switch
	private final String False = "유효하지 않은 날짜입니다.";
	private final String True = "유효한 날짜입니다.";
	
	// 3. 생성자 작성
	public MyDate(int year, int month, int day) {// <=파라메터(매개변수) set메서드랑 비슷한 형태
		this.year = year; // =>해석)this:멤버 변수를 의미.멤버변수 = 파라메터 변수 ;
		this.month = month;
		this.day = day;
	}

	// 내가 푼 조건식 풀이
	/*
	 * public String isValid() { String str = ""; if (month == 1 || month == 3 ||
	 * month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { if
	 * (day>=1 && day <= 31) { System.out.println("유효한 날짜입니다."); } else {
	 * System.out.println("유효하지 않은 날짜입니다."); } } else if (month == 4 || month == 6
	 * || month == 9 || month == 11) { if (day>=1 && day <= 30) {
	 * System.out.println("유효한 날짜입니다."); } else {
	 * System.out.println("유효하지 않은 날짜입니다."); } } else if (month == 2) { //2월일때 if
	 * ((year%400 == 0 || (year%4 == 0 && year%100 != 0))&& day <=29) { //윤년이면 29일까지
	 * System.out.println("유효한 날짜입니다."); } else {//윤년이 아니라면 if(day>=1 && day<=28)
	 * {//28일일때 System.out.println("유효한 날짜입니다.");//유효 }else {
	 * System.out.println("유효하지 않은 날짜입니다.");//28일 아니라면 유효x } } } return str; }
	 */

	// 4. isValid() : 메서드를 만들어 날짜가 정상인지 판단하는 메서드 작성
	public String isValid() {
		String str = False;
		if (month >= 1 && month <= 12) {
			switch (month) {
			case 1:case 5:case 3:case 7:case 8:case 10:case 12:
				if (day >= 1 && day <= 31) {
					str = True;
				}
				break;
			case 4: case 6: case 9: case 11:
				if (day >= 1 && day <= 30) {
					str = "유효한 날짜 입니다.";
				}
			case 2:
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					if (day >= 1 && day <= 29) {
						str = "유효한 날짜 입니다.";
					}
				} else {
					if (day >= 1 && day <= 28) {
						str = "유효한 날짜 입니다.";
					}
				}
			}
		}
		return str;
	}

//2. 각 변수의 get, set 메서드를 public으로 작성
	public int getYear() {// get은 가져오다. 매개변수가 필요 없음. 멤버변수에 저장할 것이라서
		return year;
	}

	public void setYear(int year) {// set은 설정하다. 외부 데이터를 파라메터에 불러와서
			this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return day;
	}

	public void setDate(int day) {
		this.day = day;
	}

}
