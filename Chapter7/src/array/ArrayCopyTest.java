package array;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = {10, 20, 30, 40,50};
		int[]arr2 = {1,2,3,4,5};
		for(int i=1; i<arr1.length; i++) {
			arr2[1] =arr1[1];
		}
		//System.arraycopy(복사할 대상, 복사할 시작 인덱스, 복사 결과물, 복사 결과 대상의 시작 인덱스, 복사 갯수) //반복문을 쓰지 않고 복사하는 방법
		System.arraycopy(arr1, 0, arr2, 1, 4);
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
	}

}
