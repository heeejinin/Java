package whiletest;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while 반복문
		//while(조건식) {
		//실행문;
		//증감식;
		//		}
	int i = 0;
	int sum = 0;	
	while(i<=10) { // 조건식 : true: 반복, false: 반복을 멈춤
		sum+=i; // 실행문
		i++; // 증감식
		}
	System.out.println(sum);
	}

}
