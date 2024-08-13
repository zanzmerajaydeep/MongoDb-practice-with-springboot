package com.einfochips.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.model.Address;

public interface AddressRepo extends MongoRepository<Address, String> {

}
