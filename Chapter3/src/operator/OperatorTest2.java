package operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *alt + 방향키 : 한 라인의 위치를 옮길 수 있음
		// *alt + ctrl + 방향키 : 복사 붙여넣기
		
		// > , < , >= , <= , == , != : 관계연산자, 비교연산자 => T, F로 값이 도출 됨 (조건문에 자주 사용)
		int num1 = 1;
		int num2 = 2;
		System.out.println(num1>num2); // 항1이 항 2보다 크다. false 
		System.out.println(num1<num2); // 항1은 항2보다 작다. true
		System.out.println(num1>=num2); //크거나 같다. false
		System.out.println(num1<=num2); //작거나 같다. true
		System.out.println(num1==num2); // 같다. false
		System.out.println(num1!=num2); // 같지 않다. true
		
		System.out.println();
		
		// && , || (=or), ! : 논리 연산자 => T, F로 값이 도출 됨 (조건문에 자주 사용)
		System.out.println(1<2 && 10==10); // &&(AND) : 모든 항이 True여야 True로 나옴
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println();
		
		System.out.println(true || true); // ||(OR) : 하나라도 True값이 있다면 True가 나옴
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println();
		
		System.out.println(!(10>20)); // ! : 값을 반대로 출력함
		System.out.println(!false);

	}

}
