package chapter2;

public class Valuabl2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//보라색 글자는 기본 자료형 / 일반 글자는 class (class 는 대문자로 시작해야 함)
		// 정수 자료형 
		byte b = 127; //1바이트 자료형: -128 ~ +127까지의 숫자 *128을 입력하면 에러 뜸
		short s =-32768; // 2바이트 자료형 : -32768 ~ +32767
		int i = -2147483648; // 4바이트 (integer): -2147483648 ~ +2147483647 *숫자는 보통 int를 사용한다고 생각하면 됨 
		long l = 10000000000l; // 8바이트 : -9223372036854775808 ~ +9223372036854775807 *long형의 경우 10억 단위 숫자 입력 후 l이나 L을 입력해주어야 에러X
		
		//ctrl + space + enter : 자동완성
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		
		//한 글자만 표시하는 자료형
		char c = 65; // char(Character) 아스키코드로 문자 출력 A:65 / a:97 / 
		System.out.println(c);
		char k = '가'+1; //한글 변환 / 문자 뒤에 숫자를 더해주면 다른 언어가 딤
		System.out.println(k); //int를 넣어주면 강제로 숫자 변환
		//여러 글자를 표시하는 자료형 String (Class (기본 자료형 X))
		String str = "String 자료형은 문자열을 저장합니다."; // 캐릭터를 합쳐놓은 것이 스트링, 클래스는 보라색으로 글씨가 안 뜸(그래서 대문자로 입력해주어야 함)
		System.out.println(str); //syso입력 + ctrl + space + enter: println 자동완성
		
		
		//실수 자료형
		float f = 0f; // 4바이트 *잘 사용하지 않음(숫자 마지막에 f(F)를 입력해야 에러X)
		double d = 1; //8바이트 *주 사용 실수 자료형
		System.out.println(f);
		System.out.println(d);
		for(int i2=0; i2<10; i2++) {
			d = d + 0.1;
		}
		System.out.println(d);
		
		boolean bo = false; // 논리 자료형 불린 : true(참) or false(거짓)만 저장 가능
		System.out.println(bo);
		
		
		//v(Valuable) 자동으로 자료형 변형 *많이 쓰지는 않는 방식 *함수 안에서만 입력 가능
		var v1 = 10; // 기본: int형으로 출력
		var v2 = 10.2f;  //기본: double형
		var v3 = 'a'; // char
		var v4 = true;
		var v5 = 1.12;
		var v6 = 1000123445654L;
		var v7 = "string 자료형";
		v1 = 1011;
		v2 = 1000;
		v3 = 65;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
		
		
	}

}
