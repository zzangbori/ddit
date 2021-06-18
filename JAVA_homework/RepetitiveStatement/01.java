package z_homework;

import java.util.Scanner;

public class BaseballWhile {

	public static void main(String[] args) {
		System.out.println("맞출때까지 계속하는 숫자 야구게임을 만들어보자!");
		System.out.println("중복없는 랜덤한 세자리 숫자를 생성한다.");
		System.out.println("자리와 숫자가 일치하면 스트라이크 +1");
		System.out.println("자리는 다르지만 숫자가 일치하면 볼 +1");
		System.out.println("일치하는 숫자가 없으면 아웃 +1");
		
		
		int a1 = (int)(Math.random() * 9) + 1;
		int a2;
		int a3;
		
		do{
			a2 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2);
		
		do{
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a3 || a2 == a3);
		
		System.out.println("(정답: "+a1+" "+a2+" "+a3+")");
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.print("세 자리의 숫자 입력 >> ");
			int input = sc.nextInt();
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
			
			out = 3 - strike - ball;
			
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ strike + "S " + ball + "B " + out +"O");
			System.out.println("----------------------------");
			if(strike == 3){
				System.out.println("정답입니다!!");
				break;
			}
		}
	}

}
