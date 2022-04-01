package com.kh.collection.silsub2.model.comparator;

import java.util.Comparator;

import com.kh.collection.silsub1.model.vo.Board;

public class DescBoardTitle implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		if (arg0 instanceof Board && arg1 instanceof Board) {
			Board b1 = (Board) arg0;
			Board b2 = (Board) arg1;

			return b2.getBoardTitle().compareTo(b1.getBoardTitle());
		}

		return 0;
	}

	public int compare(Board o1, Board o2) {
		// TODO Auto-generated method stub
		return o2.getBoardTitle().compareTo(o1.getBoardTitle());
	}
}
