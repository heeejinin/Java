package fortest;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문을 이용하여 구구단 출력하지
		//2단에서 9단까지
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+ "x" +j+ "=" + i*j); //만약 결과 갑이 덧셈의 값이라면 (i+j)라고 괄호로 묶어주면 사칙연산 값이 됨.
			}
		}
	}

}
