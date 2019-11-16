package com.api.javademo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.javademo.model.GetBranchesP;
public interface GetBranchesPMRepo extends MongoRepository<GetBranchesP,String>{

}
