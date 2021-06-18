package z_homework;

import java.util.Arrays;

public class RandomMultiple {

	public static void main(String[] args) {
		System.out.println("연습문제4. 1~100사이의 랜덤한 수가 100개 저장된 배열에서 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자만 정렬하여 출력해주세요.");

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		int[] temp = new int[100];
		int n = (int) (Math.random() * 4) + 2;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % n == 0) {
				temp[count++] = arr[i];
			}
		}

		arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		System.out.println("n : " + n);
		System.out.println(Arrays.toString(arr));

	}

}
