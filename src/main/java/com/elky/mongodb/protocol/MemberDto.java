package com.elky.mongodb.protocol;

import com.elky.mongodb.model.Member;

import lombok.Data;

@Data
public class MemberDto {
	private String name;
	private String address;

	public Member toModel() {
		return Member.builder()
			.name(this.name)
			.address(this.address).build();
	}
}
