package z_homework.game;

import java.util.Scanner;

public class Main {

	Character c;
	Item[] items;
	Scanner sc = new Scanner(System.in);

	Main() {
		c = new Character("가렌", 100, 50, 20, 10);

		items = new Item[10];
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}

	public static void main(String[] args) {
		new Main().start();
	}

	public static void clearScreen() {
		for (int i = 0; i < 100; i++)
			System.out.println("");
	}

	void start() {
		int input = 0;
		System.out.println("=========== 게임 시작 ===========");
		while (true) {
			System.out.println("---------- 메인 메뉴 ----------");
			System.out.println("1.내정보    2.사냥    0.종료");
			System.out.println("-------------------------------");
			System.out.print("메뉴를 입력해 주세요 >> ");
			input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				clearScreen();
				c.showInfo();
				break;

			case 2:
				clearScreen();
				hunt();
				break;

			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

	void hunt() {
		Monster m = new Monster("고블린", 20, 10, 15, 10, 150, new Item[] { items[0], items[1] });
		System.out.println("---------- 전투 화면 ----------");
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");

		int input = 0;
		battle: while (true) {
			System.out.print("1.공격  2.도망 >> ");
			input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				c.attack(m);
				if (m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다.");
					System.out.println("---------- 전투 종료 ----------");
					c.getExp(m.exp);
					c.getItem(m.itemDrop());
					System.out.println();
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println(m.name + "으로 부터 도망쳤습니다.");
				break battle;

			}
		}
	}

}
