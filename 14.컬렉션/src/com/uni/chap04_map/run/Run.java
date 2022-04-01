package com.uni.chap04_map.run;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.uni.chap04_map.model.vo.Student;

public class Run {
	/*
	 * Map : 데이터를 저장할 때 각각의 자료를 구분지을수 있는 고유의 값을 정하여 해당값으로 접근할수 있는 실제 객체를 묶어 함꼐 관리하는
	 * 자료 구조 클래스. 해당객체를 저장할 때 key(고유의 값) 은 set 의 특성으로 value(실제객체)는 List 의 특성으로 관리한다.
	 * 종류는 크게 HashMap, HashTable(예전버전 -HashMap과 동일 스레드세이프가있다 ), TreeMap, Properties
	 * 등이 있다.
	 * 
	 * - map은 key와 value로 구분되어 있고 이걸 로그인 할 때 ID와 PWD처럼 생각하면 편하다. (ID는 중복 불가능, 즉 Set과
	 * 관련이 있음을 알 수 있다.)
	 * 
	 * - key와 value를 묶어서 Entry라고 한다.
	 * 
	 * - key값은 보통 String으로 하는데, 이유는 int를 쓰면 ArrayList와 차이가 없기 때문이다.
	 */

	private static HashMap<String, Student> stdMap = new HashMap<>();

	public static void main(String[] args) {

		test();
	}

	private static void test() {
		HashMap map = new HashMap();

		map.put(1, "a"); // put이 add같은것
		map.put(4, "4");
		map.put(22, "6");
		map.put(4, "22"); // 위에 있는 (4,"4")값 위에 덮어쓰기 됨.

		System.out.println(map);

		stdMap.put("커피", new Student(1, "조현"));
		stdMap.put("도넛", new Student(2, "김영진"));
		stdMap.put("라면", new Student(3, "임찬희"));

		System.out.println(stdMap);
		stdMap.put("커피", new Student(1, "김태연")); // 키값이 중복돼서 덮어쓰기 됨
		System.out.println(stdMap);

		stdMap.put("젤리", new Student(1, "김태연")); // 벨류는 중복 가능
		System.out.println(stdMap);

		Student s = stdMap.get("커피");
		System.out.println(s);

		Student d = stdMap.remove("커피");
		System.out.println(d);
		System.out.println(stdMap);

		// 출력방법
		// 1. keySet
		// - Value를 얻고자 할때 Set인 키들을 뽑아와서 Set 형에 담아서 출력
		// - Key 값을 Set<String> 으로 만들어서 iterator 로 뽑는다.

		Set<String> kset = stdMap.keySet();
		Iterator<String> iter = kset.iterator();
		while (iter.hasNext()) {

			String key = iter.next();
			Student val = stdMap.get(key);

			System.out.println(key + " " + val);
		}

		// 2.values 메소드를 사용 (값만 뽑기)

		Collection values = stdMap.values();
		Iterator iter1 = values.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		//3.EntrySet
		//key 와 value 를 같이 얻어오고자 할때 Map의 내부 인터페이스 인 Entry 타입을 이용
		//key와 value 를 묶어서 Entry
		//-entrySet : Map.Entry 의 묶음 모음
		
		Set<Entry<String,Student>> eSet1 = stdMap.entrySet();
		Iterator<Entry<String,Student>> it1 = eSet1.iterator();
		while(it1.hasNext()) {
			Entry<String,Student> entry = (Entry)it1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
