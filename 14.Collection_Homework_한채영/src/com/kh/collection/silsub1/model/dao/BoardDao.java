package com.kh.collection.silsub1.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.WriteAbortedException;
import java.util.ArrayList;

import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {
	private ArrayList<Board> list = new ArrayList<Board>();
	private Board b = new Board();

	public BoardDao() {

		// board_list.dat 파일의 내용을
		// 읽어서 list에 저장함
		// null 될 때까지 저장함
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))) // 객체를 담아야 하니까
																									// object인풋스트림 사용
		{
			// list.addAll((Collection<? extends Board>) ois.readObject());
			list.addAll((ArrayList<Board>) ois.readObject());

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int getLastBoardNo() {

		// 게시글의 마지막 번호 리턴
		return list.get(list.size() - 1).getBoardNo();
		// 사이즈보다 하나 작은 거: 마지막 번호(인덱스)
	}

	public void writeBoard(Board board) {

		// 전달받은 게시글을 list에 추가
		list.add(board);

	}

	public ArrayList<Board> displayAllList() {

		// 게시글 전체 list를 리턴
		return list;
	}

	public Board displayBoard(int no) {

		// 전달받은 글 번호와 일치하는 게시글 리턴

		Board board = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				board = list.get(i);
				break;
			}
		}
		return board;

	}

	public void upReadCount(int no) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.get(i).setReadCount(list.get(i).getReadCount() + 1);
				break;

			}
		}

	}

	public void modifyTitle(int no, String title) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.get(i).setBoardTitle(title);
				break;
			}
		}
	}

	public void modifyContent(int no, String content) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.get(i).setBoardContent(content);
				break;
			}
		}

	}

	public void deleteBoard(int no) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.remove(i);
				break;
			}
		}
	}

	public ArrayList<Board> searchBoard(String title) {

//		for(int i = 0; i < list.size() ; i++) {
//			if(list.get(i).getBoardTitle().contains(title)) {
//				
//				
//			}
//		}

		//가이드보고 한 부분. 
		//전달받은 제목이 포함되어있는 게시글들 list 리턴

		ArrayList<Board> searchList = new ArrayList<Board>(); //서치리스트 리스트를 새로 만들어서 값을 담기..

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardTitle().contains(title)) {
				searchList.add(list.get(i));

				// 조회수 올리기
				list.get(i).setReadCount(list.get(i).getReadCount() + 1);

			}
		}
		return searchList;

	}

	public void saveListFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			oos.writeObject(list); //오류나는 지점======================================
			System.out.println("파일이 저장되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
