package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);

	public MemberController() {

	}

	public int login(String id, String pwd) {

		if (mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) { // getmemberid가 null 이라서 불러오기가 안 됨
			return 1;
		} else {
			return 0;
		}

	}

	public Member readInfo() {

		System.out.println(mem.information());
		return mem; // 주소값 반환
	}

	public int readAge() {

		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		// HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴

		String no1 = mem.getCitizenNo();

		String no2 = no1.substring(0, 2);

		int year = Integer.parseInt(no2);

		int age = 0;

		if (no1.charAt(7) == 1 || no1.charAt(7) == 2) {
			age = 2021 - (1900 + year) + 1;
		} else if (no1.charAt(7) == 3 || no1.charAt(7) == 4) {
			age = 2021 - (2000 + year) + 1;
		}
		return age; // 나이 조회하면 0살 나옴.. 
	}

	public void updateHeight(double height) {

	}

}
