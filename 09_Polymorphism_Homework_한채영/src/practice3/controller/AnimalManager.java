package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
		
		{
			ani[0] = new Dog("라떼", "강아지", 6);
			ani[1] = new Cat("삼색이", "고양이", "양어장", "삼색");
			ani[2] = new Dog("절미", "강아지", 5);
			ani[3] = new Cat("무", "고양이", "하하하네", "고등어");
			ani[4] = new Dog("진솔이", "강아지", 10);
		}

		for (int i = 0; i < ani.length; i++) {
			ani[i].speak();
		}
	}

}
