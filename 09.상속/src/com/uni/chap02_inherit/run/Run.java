package com.uni.chap02_inherit.run;

import com.uni.chap02_inherit.model.vo.Airplane;
import com.uni.chap02_inherit.model.vo.Car;
import com.uni.chap02_inherit.model.vo.Ship;
import com.uni.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {

		Airplane a = new Airplane("비행기", 0.021, "제트기", 16, 5);

		Car c = new Car("벤틀리", 12.5, "sedan", 4);

		Ship s = new Ship("낚시배", 3, "어선", 1);

		System.out.println(a.toString());
		System.out.println(c);
		System.out.println(s);

		a.howToMove();
		c.howToMove();
		s.howToMove();

		// 다형성 적용하고 howToMove() 찍기
		System.out.println("=====다형성 적용하고 for each문=====");

		Vehicle[] v = new Vehicle[3];

		v[0] = new Airplane("비행기", 0.021, "제트기", 16, 5);
		v[1] = new Car("벤틀리", 12.5, "sedan", 4);
		v[2] = new Ship("낚시배", 3, "어선", 1);

		for (Vehicle vh : v) {
			vh.howToMove();
		}

	}

}
