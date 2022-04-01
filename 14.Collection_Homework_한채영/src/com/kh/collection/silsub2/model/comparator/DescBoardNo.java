package com.kh.collection.silsub2.model.comparator;

import java.util.Comparator;
import com.kh.collection.silsub1.model.vo.Board;

public class DescBoardNo implements Comparator {
	public DescBoardNo() {
		// TODO Auto-generated constructor stub
	}

	// 이 부분은 뭐지?
	@Override
	public int compare(Object arg0, Object arg1) {
		if (arg0 instanceof Board && arg1 instanceof Board) {
			Board b1 = (Board) arg0;
			Board b2 = (Board) arg1;

			return b2.getBoardNo() - b1.getBoardNo();
		}

		return 0;
	}

	public int compare(Board o1, Board o2) {
		// TODO Auto-generated method stub
		return o2.getBoardNo() - o1.getBoardNo();
	}
}
