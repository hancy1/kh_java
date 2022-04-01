package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];

	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		return memberCount;

	}

	public Member[] getMem() {
		return mem;
	}

	public Member checkId(String id) {
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(id))
				return mem[i];
		}
		return null;
	}

	public Member searchMember(int menu, String search) { // 검색하면 null만 리턴 됨
		if (menu == 1) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(search)) {
					return mem[i];
				}
			}
		} else if (menu == 2) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getName().equals(search)) {
					return mem[i];
				}
			}
		} else if (menu == 3) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getEmail().equals(search)) {
					return mem[i];
				}
			}
		}

		return null; // 체크

	}

	public void insertMember(Member member) {
		mem[memberCount++] = member;
	}

	public void updateMember(Member m, int menu, String update) {

		if (menu == 1) {
			m.setUserPwd(update);
		} else if (menu == 2) {
			m.setName(update);
		} else if (menu == 3) {
			m.setEmail(update);
		}

	}

	public void deleteMember(String userId) { // 체크

//		for (int i = 0; i < mem.length; i++) {
//			if (userId.equals(mem[i].getUserId())) {
//				mem[i] = null;
//			}
//		}
//		for (int i = 0; i < mem.length; i++) {
//			mem[i] = mem[--i];
//		}
//		memberCount--;

		// 현재 회원수만큼 반복
		for (int i = 0; i < memberCount; i++) {

			// 해당 순차적으로 접근한 객체의 아이디와 전달된 삭제할 회원의 아이디와 비교
			if (mem[i].getUserId().equals(userId)) {// 일치하는 회원 찾았을 경우

				// 만약 해당 회원이 마지막 회원이였을 경우
				if (i == memberCount - 1) {
					mem[i] = null; // 해당 회원 삭제만하면 됨 (null로 대입)

				} else { // 만약 해당 회원이 마지막 회원이 아닌 중간에 있었던 회원이였을 경우 => 뒤에 있는 회원들을 한칸씩 앞으로 땡겨야 된다.

					// 뒤에 있었던 회원들을 한칸씩 앞으로 땡기는 작업
					for (int j = i; j < memberCount - 1; j++) {
						mem[j] = mem[j + 1];
					}
					mem[memberCount - 1] = null; // 그리고 마지막이였던 회원은 null로
				}

				memberCount--; // 삭제했으니깐 memberCount 1감소

				break; // 삭제 한 후 이 반복문 빠져나가야됨

			}

		}

	}

	public Member[] sortIdAsc() {

//		Member[] copy = mem.clone();
//
//		for (int i = 0; i < copy.length; i++) {
//			for (int j = i + 1; j < copy.length; j++) {
//				if (copy[j].getUserId().compareTo(copy[j + 1].getUserId()) > 0) {
//
//					Member tmp = copy[j];
//					copy[j] = copy[j + 1];
//					copy[j + 1] = tmp;
//				}
//			}
//		}
//
//		return copy;

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}

		}
		return copy;
	}

	public Member[] sortIdDesc() {

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {

					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}
		}
		return copy;
	}

	public Member[] sortAgeAsc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - (copy[j].getAge()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}

		}
		return copy;
	}

	public Member[] sortAgeDesc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() > 0) {

					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}
		}
		return copy;
	}

	public Member[] sortGenderDesc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getGender() > copy[j].getGender()) {

					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}
		}
		return copy;
	}

}
