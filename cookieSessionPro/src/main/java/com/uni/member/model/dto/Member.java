package com.uni.member.model.dto;

import lombok.Data;

@Data //게터, 세터, 기본생성자 자동으로 생성해줌
//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberName;

	
	
}
