package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	private Member mem = null;// null로 명시초기화
	private Book[] bList = new Book[5]; // 크기 5 할당

	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem; // 인서트하는 부분
	}

	public Member myInfo() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		Book[] bk = new Book[5];

		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면  HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기  HINT : count 이용
		// 해당 검색결과의 도서목록 주소 값 리턴
		int count = 0;

		for (int i = 0; i < count; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				bk[count] = bList[i];
			}
		} 
		count++;
		
		return bk; // 체크
	}

	public int rentBook(int index) {

		int result = 0;

		if (bList[index] instanceof AniBook) {
			if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook) bList[index]).isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1); // 체크
				result = 2;
			}
		}
		return result;
	}
}
