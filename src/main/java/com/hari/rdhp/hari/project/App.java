package com.hari.rdhp.hari.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
//@slf4j
public class App
{
    public static void main( String[] args )
    {
    	Logger log=LoggerFactory.getLogger(App.class);
    	log.info("App Starts");
		 List<Entity> entityList = new ArrayList<Entity>();
		 for(int iterator = 0;iterator<10;iterator++) {
			 entityList.add(formEntity(iterator));
		 }
		 entityList.stream().forEach(eachData ->{
			 System.out.println(eachData.getFirstName());
		 });
    	log.info("App Ends");
    }
    
    private static Entity formEntity(int iterator) {
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
		 return eachEntity;
    }

}
