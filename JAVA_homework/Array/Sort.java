package z_homework;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
     * !!문제가 아닙니다. 배열 정렬 방식 입니다. 필요하시면 응용해서 사용하시면 됩니다.!!
		 * 정렬
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[1000];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 1000) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("");
		
		double tStart;
		
		tStart = System.currentTimeMillis();
		printRank(arr); //석차구하기
		System.out.println("석차구하기 소요시간 : " + (System.currentTimeMillis() - tStart) + "ms");
		System.out.println();
		
		tStart = System.currentTimeMillis();
		selectSort(arr); //선택정렬
		System.out.println("선택정렬 소요시간 : " + (System.currentTimeMillis() - tStart) + "ms");
		System.out.println();
		
		tStart = System.currentTimeMillis();
		bubbleSort(arr); //버블정렬
		System.out.println("버블정렬 소요시간 : " + (System.currentTimeMillis() - tStart) + "ms");
		System.out.println();
		
		tStart = System.currentTimeMillis();
		insertSort(arr); //삽입정렬
		System.out.println("삽입정렬 소요시간 : " + (System.currentTimeMillis() - tStart) + "ms");
		System.out.println();
		
	}

	private static void insertSort(int[] arr) {
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(temp < arr[j]){
					arr[j + 1] = arr[j];
				}else{
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void printRank(int[] arr) {
		int[] rank = new int[arr.length];
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++;
				}
			}
		}
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i > 0) System.out.print(", ");
			System.out.print(arr[i] + " : " + rank[i] + "등");
		}
		System.out.println("]");
	}

}
