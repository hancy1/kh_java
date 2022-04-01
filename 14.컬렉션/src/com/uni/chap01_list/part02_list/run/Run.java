package com.uni.chap01_list.part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.uni.chap01_list.part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {

		//E -> Element : 리스트가 담길 요소(객체)
		ArrayList<Music> list = new ArrayList<Music>();
		
		//1. add(E) : 리스트의 끝에 인스턴스 객체 데이터를 추가하는 메소드
		//            (내부적으로 사이즈를 검사한 다음에 수용가능한 범위면 바로 데이터가 추가되고, 범위가 넘어가면 사이즈가 커진 후 데이터가 추가됨)
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("가을아침", "아이유"));
		list.add(new Music("비", "폴킴"));
		
		//list.add("끝"); Music타입만 받기에 String타입은 받을 수 없음.
		System.out.println(list.toString());	
		
		//2. add(int index, E e) : 인덱스를 지정해서 해당 인덱스에 인스턴스 추가하는 메소드(내부적으로 기존에 있는 것은 뒤로 땡기고 해당 인덱스에 값 추가)
		list.add(1, new Music("오늘도 빛나는 너에게", "마크툽"));
		
		System.out.println(list);
		
		//3. set(int index, E e) : 해당하는 인덱스의 값을 E로 변경
		list.set(0, new Music("상상더하기", "라붐"));
		
		System.out.println(list);
		
		//4. size() : 리스트 안에 몇 개의 데이터가 있는지 크기 반환
		System.out.println("list의 size: " + list.size());
		
		//5. remove(int index) : 해당하는 인덱스의 인스턴스를 삭제. 뒤의 인덱스는 앞으로 땡겨지고 크기 줄어듦.
		
		//list.remove(2);
		list.remove(new Music("상상더하기", "라붐")); //hashcode와 equals 오버라이딩 필요함
		System.out.println(list);
		System.out.println("list의 size: " + list.size());
		
		//6. get(int index) : 해당하는 인덱스의 인스턴스(객체) 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(0).getTitle());
		
		//7. subList(int index1, int index2) : index1에서 index2앞까지 추출해서 새로운 list로 반환
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		//8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가하는 메소드
		list.addAll(sub);
		System.out.println(list);
		System.out.println("list의 size: " + list.size());
		
		//9. isEmpty() : 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty()); // 값이 있기 때문에 false반환
		
		//10. clear() : 비우기
		//list.clear();
		//System.out.println(list.isEmpty()); // clear통해 값을 비웠기 때문에 true반환

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==================");
		for(Object m : list) {
			System.out.println(m);
		}
	}

}
