package z_homework;

public class Coin {

	public static void main(String[] args) {
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
