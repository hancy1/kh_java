package com.uni.chap05_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Run {

	public static void main(String[] args) {

		// .properties를 사용하는 경우는
		// 1. 해당 프로그램이 기본적으로 가지고 있는 정보들을 .properties 확장자 문서로 저장해놓으면
		// key value 모두 문자열이기 때문에 개발자가 아닌 일반인 관리자가 해당 문서를 다루기가 쉽다.
		// --> JDBC 가면 한번 사용해 볼거다.

		// 2. xml파일로 저장할 수 있는 메소드를 따로 제공
		// .xml 파일은 프로그래밍 언어간에 호환이 쉽다. 즉, 자바에서 작업하고 xml파일로 저장하면
		// C언어에서 불러들여 사용할 수 있다는점

		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin@localhost:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");

		System.out.println(prop);

		// 1. Iterator
		System.out.println("=====Iterator=====");
		Set st = prop.keySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key);
			System.out.println(prop.getProperty(key));
		}

		// 2. Eunmeration
		System.out.println("=====Enumeration=====");
		Enumeration em = prop.keys();
		while (em.hasMoreElements()) {
			String key = (String) em.nextElement();
			System.out.println(key + " " + prop.getProperty(key));
		}

		System.out.println("Properties 담긴 정보를 Properties 파일로 저장 및 불러오기");

		try {
			//prop.store(new FileOutputStream("prop.properties"), "Test properties"); // 파일명, 코멘트
			prop.storeToXML(new FileOutputStream("prop.xml"), "Test Xml");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Properties readProp = new Properties();
		try {
			//readProp.load(new FileInputStream("prop.properties"));
			readProp.loadFromXML(new FileInputStream("prop.xml"));
			
			Set st1 = readProp.keySet();
			Iterator it1 = st1.iterator();
			
			while(it1.hasNext()) {
				String key = (String)it1.next();
				System.out.println(key + "---" + readProp.getProperty(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
