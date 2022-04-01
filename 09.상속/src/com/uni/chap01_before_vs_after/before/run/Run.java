package com.uni.chap01_before_vs_after.before.run;

import com.uni.chap01_before_vs_after.before.model.vo.Desktop;
import com.uni.chap01_before_vs_after.before.model.vo.SmartPhone;
import com.uni.chap01_before_vs_after.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {

		Desktop d = new Desktop("삼성" , "d_01", "데스크탑", 1000000, true);
		SmartPhone s = new SmartPhone("삼성" , "s_01", "스마트폰", 10000, "kt");
		Tv t = new Tv("삼성" , "t_01", "티비", 1000000, 46);
		
		System.out.println(d);
		System.out.println(s);
		System.out.println(t);
	}

}
