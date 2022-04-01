package com.uni.chap01_poly.part02_electronic.controller;

import com.uni.chap01_poly.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.uni.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {

	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	public void insert(Desktop d) { //run의 인서트 값(d)를 desk에 담음
		desk = d;
	}

	public void insert(NoteBook n) {
		note = n;
	}

	public void insert(Tablet t) {
		tab = t;
	}

	public Desktop selectDesktop() { //desk에 담겨있던 run의 인서트 값을 반환
		return desk;
	}

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tab;
	}

}
