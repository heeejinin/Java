package operator;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +=, -= ,*= , /= , %= : 복합 대입 연산자
		int i = 10;
		int j = 20;
		//i = i+j;
		System.out.println(i+=j); // i를 j에 더하여 저장 
		//i = i-j;
		System.out.println(i-=j); // i에 j를 빼서 저장
		//i = i%j;
		System.out.println(i*=j); // i에 j를 곱하여 저장
		//i= i/j;
		System.out.println(i/=j); // i에 j를 나누어 저장
		//i =i%j;
		System.out.println(i%=j); // i에 j를 나눈 나머지를 저장
		System.out.println(10/20);
		
	}

}
