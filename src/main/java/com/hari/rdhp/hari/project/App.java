package com.hari.rdhp.hari.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.IntStream;

import org.apache.cassandra.db.Clustering;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

/**
 * Hello world!
 *
 */
@slf4j
public class App
{
	private static Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	
    	log.info("App Starts...");
		 List<Entity> entityList = new ArrayList<Entity>();
		 for(int iterator = 0;iterator<10;iterator++) {
			 entityList.add(formEntity(iterator));
		 }
		 entityList.stream().forEach(eachData ->{
			 System.out.println(eachData.getFirstName());
		 });
		 createCluster();
		 
    	log.info("App Ends...");
    }
    
    private static Entity formEntity(int iterator) {
    	log.info("formEntity method starts...");
    	Entity eachEntity = new Entity();
		 eachEntity.setRollNo(UUID.nameUUIDFromBytes(("Hari"+iterator).getBytes()));
		 eachEntity.setAddress("30 - Bharathiyar Street");
		 eachEntity.setCountry("INDIA");
		 eachEntity.setDistrict("Coimbatore");
		 eachEntity.setEmail("hari.csesoft@gmail.com");
		 eachEntity.setFirstName("Hari"+iterator);
		 eachEntity.setLastName("Ramasamy");
		 eachEntity.setmobileNo("+91 9786115972");
		 eachEntity.setState("TamilNadu");
		 log.info("formEntity method ends...");
		 return eachEntity;
    }
    
    private static void createCluster() {
    	log.info("createCluster method starts...");
    	Cluster firstBuilder = Cluster.builder().addContactPoint("127.0.0.1").build();
    	Session creatingSession = firstBuilder.connect("haridatabase");
    	creatingSession.execute("Create table haridatabase.secondEntity(roll_no Blob Primary key, "
    			+ "first_name text, last_name text, email text, address text, district text, "
    			+ "state text, country text, mobile_no text);");
    	log.info("createCluster method ends...");
    }
}
