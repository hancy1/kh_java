package com.uni.chap03_char.run;

import com.uni.chap03_char.model.dao.FileCharTest;

public class Run {

	public static void main(String[] args) {

		FileCharTest a = new FileCharTest();
		a.fileSave();
		a.fileOpen();
	}

}
