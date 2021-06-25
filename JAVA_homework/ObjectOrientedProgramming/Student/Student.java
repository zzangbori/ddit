package z_homework.student;

import java.util.Random;

public class Student {
	private String name;
	private int age, java, oracle, sql;
	private Random rnd = new Random();
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.java = rnd.nextInt(101);
		this.oracle = rnd.nextInt(101);;
		this.sql = rnd.nextInt(101);;
	}
	
	public void showInfo() {
		System.out.printf("[%3s%4s세%4s점%4s점%4s점%6s점]\n", this.name, this.age, this.java, this.oracle, this.sql, getAverage());
	}
	
	public double getAverage(){
		return Math.round(((java+oracle+sql) / 3.0) * 10) / 10.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getKorean() {
		return java;
	}
	public void setKorean(int korean) {
		this.java = korean;
	}
	public int getEnglish() {
		return oracle;
	}
	public void setEnglish(int english) {
		this.oracle = english;
	}
	public int getMath() {
		return sql;
	}
	public void setMath(int math) {
		this.sql = math;
	}
	
}
