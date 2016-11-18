package org.launchcode.models.dao;
//data access  (dao) allows us to query and save in the database for hellolog objects

import java.util.List;

import javax.transaction.Transactional;

import org.launchcode.models.HelloLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//we are using dependency injection with CrudRepository
//Spring will automatically implement a class of HelloLogDao and it will implement the methods recognized by Spring and very intentionally named to do that
@Transactional
@Repository//this makes spring automatically implement this interface at startup
public interface HelloLogDao extends CrudRepository<HelloLog, Integer>{
		
	//spring recognized naming conventions on methods
		public List<HelloLog> findAll();
		
		public HelloLog findByUid(Integer uid);
		
	//	public List<HelloLog> findByName(String name);//finds all instances that I said hello to that one person
	
}
