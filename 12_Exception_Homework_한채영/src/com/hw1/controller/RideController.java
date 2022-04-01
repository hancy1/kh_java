package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController {

	Guests[] gs = new Guests[4];
	Guests[] onboard;

	public RideController() {
	}

	public void cutGuests() {

		gs[0] = new Guests("홍길동", 17, 'M', 120.2);
		gs[1] = new Guests("유관순", 20, 'F', 102.3);
		gs[2] = new Guests("김유신", 23, 'M', 110.4);
		gs[3] = new Guests("김흥부", 21, 'M', 112.5);

		// RollerCoaster rc = new RollerCoaster();

		onboard = new Guests[RollerCoaster.PERMITNUMBER];

		try {
			for (int i = 0; i < gs.length; i++) {

				onboard[i] = gs[i];

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호: " + e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요.");
			System.out.println("이번 차례 탑승 명단: ");

			int count = 0;

			for (Guests g : onboard) {
				System.out.println("이름: " + g.getName() + ", 키: " + g.getHeight());
				count++;
			}

			System.out.println("탑승자 요금: " + count * RollerCoaster.PRICE);
		}

	}
}
