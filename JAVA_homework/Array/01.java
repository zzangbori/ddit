package z_homework;

import java.util.Arrays;

public class ArrayQuizs {

	public static void main(String[] args) {
		quiz1(); //거스름돈 동전 갯수
		System.out.println();
		System.out.println();
		quiz2(); //그래프 그리기
		System.out.println();
		System.out.println();
		quiz3(); //같은 숫자는 싫어
		System.out.println();
		System.out.println();
		quiz4(); //나누어 떨어지는 숫자 배열
	}

	private static void quiz4() {
		System.out.println("연습문제4. 1~100사이의 랜덤한 수가 100개 저장된 배열에서 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자만 정렬하여 출력해주세요.");
		
		
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		int[] temp = new int[100];
		int n = (int)(Math.random() * 4) + 2;
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % n == 0){
				temp[count++] = arr[i];
			}
		}
		
		arr = new int[count];
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp[i];
		}
		
		for(int i = 0; i < arr.length; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[min]){
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

	private static void quiz3() {
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

	private static void quiz2() {
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

	private static void quiz1() {
		System.out.println("연습문제1. 10~5000원 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요. (1원,5원 동전은 없습니다.)");
		
		
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10 };
		
		System.out.println("거스름돈 : " + money);
		
		for(int i = 0; i < coin.length; i++){
			System.out.println(coin[i] + "원 : " + money / coin[i] + "개");
			money = money % coin[i];
		}
	}

}
