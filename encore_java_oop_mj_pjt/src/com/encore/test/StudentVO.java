package com.encore.test;


/*
  xxxxVO.java, xxxxDTO.java, xxxxEntity.java
  위 세가지는 업무로직이 없는 자바 파일임.
 */
public class StudentVO {
		//클래스 = 변수 + 메서드
		// 변수
	public String name;
	private int age;
	private double height;
	private boolean isMarriage;
	
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
}
