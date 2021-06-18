package z_homework;

import java.util.Arrays;

public class NoDuplication {

	public static void main(String[] args) {
		System.out.println("연습문제3. 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.");
		
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] temp = new int[10];
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean dupl = false;
			for(int j = 0; j < temp.length; j++){
				if(arr[i] == temp[j]){
					dupl = true;
				}
			}
			if(!dupl){
				temp[count++] = arr[i];
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));

	}

}
