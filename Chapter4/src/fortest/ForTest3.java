package fortest;

public class ForTest3 {

	public static void main(String[] args) {
		//continue 문
		//반복문 안에서 continue 만나면 다음 나머지 코드를 실행하지 않고 다음 반복을 실행
		//2의 배수를 제외한 출력하는 반복문 
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue; //continue 를 만나면 다음 증감식으로 넘어가게 됨 (if 문에 해당하는 값을 제외하게 됨)
			}
			System.out.println(i);
		}
		System.out.println();
		//break 문
		//반복문 안에서 break;를 만나면 반복문을 종료
		int sum = 0;
		int i = 0;
		for(i=0; i<=100; i++) {
			if(sum > 3) {
				break;
			}
			sum+=i;
		}
		System.out.println(sum + "이 될 때까지 더한 횟수" + i);
		System.out.println(sum);
	}

}
