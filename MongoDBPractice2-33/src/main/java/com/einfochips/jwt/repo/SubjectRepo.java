package com.einfochips.jwt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.jwt.model.Subjects;

public interface SubjectRepo  extends MongoRepository<Subjects, String>{

}
