package chapter2;

public class valuable1 {

	public static void main(String[] args) {
		//자료형(ex.int) 변수명(ex.level,...);<- 선언했다 라고 함
		int level = 10;
		//변수명 = 숫자; <-초기화(처음 값을 넣어주는 것 라고 함, '='는 대입하겠다 라는 의미
		System.out.println(level);
		level = 100;
		System.out.println(level);
		int level3 = 1000;
		System.out.println(level);
		// 변수명 작성 규칙
		//1. 변수이름은 영문자나 숫자를 사용할 수 있고 특수문자 중에서 $, _만 사용할 수 있음.
		//2. 변수 이름은 숫자로 시작할 수 없음.
		//3. 자바에서 이미 사용중인 예약어는 사용할 수 없음.
		
		// 표기법
		// 카멜 표기법 (변수명, 메서드명) : 첫 단어의 첫 글자는 소문자로 나머지 단어의 첫 글자는 대문자로 작성 
		// ex. studentNumber
		// 파스칼 표기법 (클래스명) : 첫 단어부터 다른 단어의 모든 첫글자는 대문자로 작성 ex. Student
		// 언더스코어 표기법 (상수, 데이터베이스의 필드명) : 단어의 사이에 _를 넣어서 작성 ex. student_number
		int level4 = 0;
		level4 = 0;
		System.out.println(level4);
	}

}
