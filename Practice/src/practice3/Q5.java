package practice3;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. 크기가 10인 배열을 작성하고 Math.random()함수를 사용하여 1~100사이의 숫자를 랜덤하게 생성하
		// 고 생성된 숫자가 3의 배수인 것만 배열에 저장하는 프로그램을 작성하라. (단 배열의 각 요소는 서로
		// 다른 값만 저장되도록 한다.)
		int[] arr5 = new int[10];
		for (int i = 0; i < arr5.length; i++) {
			int randomNum = (int) (Math.random() * 100 + 1); // 1~100까지의 랜덤값 저장
			boolean flag = true; // 값이 중복되거나 3의 배수가 아닌 경우 한번 더 반복시키는 변수
			if (randomNum % 3 == 0) { // 3의 배수인지 확인하는 if문
				for (int j = 0; j < arr5.length; j++) { // 배열 안의 값이 중복되는지 확인하는 반복문
					if (arr5[j] == randomNum) { // 배열의 값과 랜덤갑 ㅅ비교하는 if문
						flag = false; // 중복되는 숫자가 있으면 false 설정
					}
				}

			} else {// 3으로 나누어 떨어지지 않는 경우 false 설정
				flag = false;
			}
			if (flag == false) { // 중복이거나 3의 배수가 아니면 다음 반복실행하지 않도록 해주는 if문
				i--; // 같은 반복을 계속하도록 i에서 1을 빼줌
			} else {
				arr5[i] = randomNum; // 배열에 3의 배수 저장
			}
		}
		System.out.println(Arrays.toString(arr5));
	}

}
