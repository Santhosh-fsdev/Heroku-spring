package com.santhosh.repo.repository;

import com.santhosh.repo.model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface DataRepository extends MongoRepository<Data, String> {

}
