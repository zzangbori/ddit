package z_homework;

import java.util.Arrays;

public class Graph {

	public static void main(String[] args) {
		System.out.println("연습문제2. 1~5사이의 랜덤한 값이 20개 저장된 배열에서 1 ~ 5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.");
		
		
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] count = new int[5];
		for(int i = 0; i < arr.length; i++){
			count[arr[i] - 1]++;
		}
		for(int i = 0; i < count.length; i++){
			System.out.print(i + 1 + " : ");
			for(int j = 0; j < count[i]; j++){
				System.out.print("*");
			}
			System.out.println(" " + count[i]);
		}

	}

}
