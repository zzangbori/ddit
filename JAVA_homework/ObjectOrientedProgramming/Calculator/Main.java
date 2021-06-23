package z_homework;

public class Main {

	public static void main(String[] args) {
		System.out.println("다음을 한줄식 계산해서 최종 결과값을 출력해주세요.");
		System.out.println("1. 123456 + 654321");
		System.out.println("2. 1번의 결과값 * 123456");
		System.out.println("3. 2번의 결과값 / 123456");
		System.out.println("4. 3번의 결과값 - 654321");
		System.out.println("5. 4번의 결과값 % 123456");
		System.out.println("* 반드시 Calculator Class를 생성하고, 각 계산에 필요한 메서드를 생성/호출 하세요.");
		System.out.println();
		System.out.println();
		Calculator c = new Calculator();
		double result = c.add(123456, 654321);
		System.out.println("1. "+result);
		result = c.multiply(result, 123456);
		System.out.println("2. "+result);
		result = c.divide(result, 123456);
		System.out.println("3. "+result);
		result = c.subtract(result, 654321);
		System.out.println("4. "+result);
		result = c.remainder(result, 123456);
		System.out.println("5. "+result);
	}

}
