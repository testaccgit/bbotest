package com.api.javademo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.javademo.model.GetAccountDetailsP;
public interface GetAccountDetailsPMRepo extends MongoRepository<GetAccountDetailsP,String>{

}
