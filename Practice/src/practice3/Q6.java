package practice3;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 배열을 사용하여 다음의 숫자를 정렬하라. 정렬방법은 선택정렬, 삽입정렬, 버블정렬을 수행하라. 15, 7, 2, 9, 10, 12,
		// 17, 11, 20, 5
		// 택 1)
		int[] arr = { 15, 7, 2, 9, 10, 12, 17, 11, 20, 5 };
		int tempValue = 0;
		int tempJ = 0;
		for (int i6 = 0; i6 < arr.length; i6++) {// 배열을 처음부터 긑까지 실행하기 위한 반복문
			int min = Integer.MAX_VALUE; // 정수형 int의 가장 큰 숫자
			for (int j = i6; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];// 7 5
					tempJ = j; // 1 9
				}
			}
			tempValue = arr[i6]; // 원래 값을 저장하는 변수 7
			arr[i6] = arr[tempJ]; // 5
			arr[tempJ] = tempValue; // 7
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("=========================================================");
		int[] arr2 = { 15, 7, 2, 9, 10, 12, 17, 11, 20, 5 };
		Arrays.sort(arr2); // Arrays는 배열을 뜻함
		System.out.println(Arrays.toString(arr2));
	}

}
