package com.hari.rdhp.hari.project;

import java.util.Objects;
import java.util.Scanner;

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
		Scanner scanInput = new Scanner(System.in);
    	int inputInt = scanInput.nextInt();
    	log.info("The Entered Input is "+getResult(inputInt)); 
    	log.info("App Ends");
    }
    
    private static int getResult(int result) {
    	if(Objects.nonNull(result)) {
    		return result;
    	}
    	return 0;
    }

}
