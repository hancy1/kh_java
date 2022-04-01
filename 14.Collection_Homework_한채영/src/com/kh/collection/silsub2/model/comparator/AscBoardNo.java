package com.kh.collection.silsub2.model.comparator;

import java.util.Comparator;

import com.kh.collection.silsub1.model.vo.Board;

public class AscBoardNo implements Comparator {
	public AscBoardNo() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Object arg0, Object arg1) {
		if (arg0 instanceof Board && arg1 instanceof Board) {
			Board b1 = (Board) arg0;
			Board b2 = (Board) arg1;

			return b1.getBoardNo() - b2.getBoardNo();
		}

		return 0;
	}

	public int compare(Board o1, Board o2) {

		return o1.getBoardNo() - o2.getBoardNo();
	}

}
