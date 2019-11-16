package com.api.javademo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.javademo.model.GetAccountStatementP;
public interface GetAccountStatementPMRepo extends MongoRepository<GetAccountStatementP,String>{

}
