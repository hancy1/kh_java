package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);

	public FileDao() {

	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.println("파일에 저장할 내용을 반복해서 입력하세요(\"exit\"을 입력하면 내용 입력 끝): ");
			String text = sc.nextLine();
			if (!text.equals("exit")) {
				sb.append(text);
			}
			System.out.println("저장하시겠습니까?");
			String yn = sc.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				System.out.println("파일명을 입력하세요: ");
				String name = sc.nextLine();

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(name))) {
					bw.write(sb.toString()); // 체크
					System.out.println(name + "파일에 성공적으로 저장하였습니다.");

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("다시 메뉴로 돌아갑니다.");
				return;
			}
		}

	}

	public void fileOpen() {

		System.out.println("열기 할 파일명: ");
		String name = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(name))) {
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileEdit() { //어려운 부분 

		StringBuilder sb = new StringBuilder();

		System.out.println("수정할 파일명: ");
		String name = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(name));
				BufferedWriter bw = new BufferedWriter(new FileWriter(name))) {

			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}
			System.out.println("파일에 추가할 내용을 입력하시오(exit: 입력종료): ");
			while (true) {
				String text = sc.nextLine();

				if (text.equals("exit")) {
					System.out.println("변경된 내용을 파일에 추가하겠습니까?");
					String yn = sc.nextLine();
					if (yn.equalsIgnoreCase("y")) {
						bw.toString();
						System.out.println("입력받은 " + name + "파일의 내용이 변경되었습니다.");
					}
				}
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
