package com.elky.mongodb.repository;

import com.elky.mongodb.model.Member;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepo extends MongoRepository<Member, String> {
}
