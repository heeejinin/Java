package whiletest;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50부터 100까지의 숫자를 더하는 프로그램
		
		int i = 50;
		int sum = 0;
		while(i<=100) { // 조건식
			sum+=i;  // 실행문
		 //=sum = sum + i; 라는 뜻 (sum+=i;)
			i++; // 증감식
		}
		System.out.println(sum);
		
		
		//do - while 문
//		do {
//			실행문
//			증감식
//			
//		}while(조건식); while 조건식에 false가 있어도 do 부분은 실행이 됨 (while문과의 차이점)
		int number = 1;
		int sum2 = 0;
		do {
			sum2 += number; // 실행문
			number++; // 증감식
		}while(number<=10); // 조건식
		System.out.println(sum2);
	}

}
