package com.api.javademo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.javademo.model.GetAccountsP;
public interface GetAccountsPMRepo extends MongoRepository<GetAccountsP,String>{

}
