package operator;

public class OperatorTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건 연산자, 3항 연산자
		//	   조건식 ? true : false
		int i = 10>20 ? 10 : 20; // ? 앞에 있는 조건의 결과 거짓이므로 10(참) : 20(거짓) 의 20이 도출됨 
		System.out.println(i);
		String str = 10>20 ? "참" : "거짓"; // 거짓
		System.out.println(str);
		
		//연산자의 우선 순위
		// 1 : () , [] , .
		// 2 : !, ++n , --n , -n(음수) , +n(양수) (증감 연산자)
		// 3 : % , / , *
		// 4 : + , - 
		// 5 ; < , > , <= , >=
		// 6 : &&
		// 7 : ||
		// 8 : ?: (조건 연산자)
		// 9 : = , += , -= , *= , /= , %= : (대입 연산자)
		// 10 : 2++ , 2--
		
		//				(산술연산자)	         (조건 연산자)	
		int result = (10+1+(10*2)-(10/2)+10) > 10 ? 0 : 1;
		System.out.println(result);
	}

}
