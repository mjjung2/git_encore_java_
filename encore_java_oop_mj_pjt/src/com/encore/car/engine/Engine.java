package com.encore.car.engine;

public class Engine {

		private String engineType ; 
		// 생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재정의할 수 있다. = 생성자 오버로딩 or 메서드 오버로딩
		public Engine() {
		}
		public Engine(String engineType) { // 이 인자로 들어오는 값을 멤버변수에 할당하는 게 생성자의 역할
			this.engineType = engineType ;
		}
		
		public String showInfo() {
			return "엔진의 타입은 " + engineType+ " 입니다.";
		}
}
