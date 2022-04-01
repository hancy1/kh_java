package com.uni.chap04_assist.part02_object.run;

import com.uni.chap04_assist.part02_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {

		ObjectsDao o = new ObjectsDao();
		o.fileSave();
		o.fileOpen();
	}

}
