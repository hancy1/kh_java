package com.uni.chap01_poly.part02_electronic.run;

import com.uni.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.uni.chap01_poly.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poly.part02_electronic.model.vo.Electronic;
import com.uni.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.uni.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {

		// 1. 다형성 적용 전

		/*
		 * ElectronicController ec = new ElectronicController();
		 * 
		 * ec.insert(new Desktop("삼성", "데스크탑", 10000, "GeForce 1070")); ec.insert(new
		 * NoteBook("Lg", "그램", 2000000, 3)); ec.insert(new Tablet("애플", "아이패드",
		 * 2000000, false));
		 * 
		 * Desktop d = ec.selectDesktop(); NoteBook n = ec.selectNoteBook(); Tablet t =
		 * ec.selectTablet();
		 * 
		 * System.out.println(d); System.out.println(n); System.out.println(t);
		 */

		// 2. 다형성 적용 후

		ElectronicController2 ec = new ElectronicController2();
		ec.insert(new Desktop("삼성", "데스크탑", 10000, "GeForce 1070"));
		ec.insert(new NoteBook("Lg", "그램", 2000000, 3));
		ec.insert(new Tablet("애플", "아이패드", 2000000, false));

		Electronic d = ec.select(0);
		Electronic n = ec.select(1);
		Electronic t = ec.select(2);

		System.out.println(d);
		System.out.println(n);
		System.out.println(t);

		Electronic[] el = ec.selectAll();
		
		System.out.println("=====for 반복문=====");
		for (int i = 0; i < el.length; i++) {
			if (el[i] instanceof Desktop) {
				((Desktop) el[i]).setGraphic("GeForce 1080");

				System.out.println(((Desktop) el[i]).getGraphic());
			} else if (el[i] instanceof NoteBook) {
				System.out.println(((NoteBook) el[i]).getUsbPort());
			} else {
				System.out.println(((Tablet) el[i]).isPenFlag());
			}
		}
		
		
		System.out.println("=====for each문=====");
		for(Electronic e : el) {
			if (e instanceof Desktop) {
				((Desktop)e).setGraphic("GeForce 1080");

				System.out.println(((Desktop) e).getGraphic());
			} else if (e instanceof NoteBook) {
				System.out.println(((NoteBook) e).getUsbPort());
			} else {
				System.out.println(((Tablet) e).isPenFlag());
			}
		}

	}
	/*
	 * 다형성을 사용하는 이유 
	 * 1. 부모타입의 객체배열로 다양한 자식들을 받아 올수 있다. --> 부모타입 하나로 다양한 자식을 다룰수 있다.
	 * 
	 * 2. 매개변수에 다형성을 적용하는 경우 메소드갯수가 줄어든다.
	 */

}
