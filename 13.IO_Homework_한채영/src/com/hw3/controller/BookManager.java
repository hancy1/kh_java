package com.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);

	public BookManager() {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {

		Book[] bk = new Book[5];

		{
			bk[0] = new Book("C언어", "김씨", 10000, null, 0.1);
			bk[1] = new Book("자바", "이씨", 20000, null, 0.2);
			bk[2] = new Book("C++", "박씨", 30000, null, 0.3);
			bk[3] = new Book("넛지", "서씨", 40000, null, 0.4);
			bk[4] = new Book("개미", "최씨", 50000, null, 0.5);

		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {

			for (int i = 0; i < bk.length; i++) {
				oos.writeObject(bk[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Calendar setCalender(int year, int month, int date) {

		System.out.println("year: ");
		int nYear = sc.nextInt();

		System.out.println("month: ");
		int nMonth = sc.nextInt();

		System.out.println("date: ");
		int nDate = sc.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(nYear, nMonth, nDate);
		// 시간에 대해 원하는 값 뽑기

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");

		return calendar;

	}

	public void fileRead() {
		Book[] readBook = new Book[10];

		int i = 0;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {

			while (true) {
				System.out.println(readBook[i]);
				i++;
			}
		} catch (EOFException e) {
			System.out.println("읽기 완료!");
			return;
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
