package com.encore.car;

import com.encore.car.engine.Engine;

public class Car {
		//아래는 전역변수(멤버변수)
		private Engine engine ;
		// 기본 생성자 정의
		// 생성자는 like a method 로 반환타입이 정의되지 않고 메서드의 이름은 클래스의 이름과 동일해야 함.
		public Car() {
			engine = new Engine() ;
		}
		public Car(String type) {
			engine = new Engine(type);
		}
		
		public void engineInfo() {
			String info = engine.showInfo() ;
			System.out.println(">>>> 엔진 정보 <<<<");
			System.out.println(info);
		}
		
}
