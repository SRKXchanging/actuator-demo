package com.psa.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorDemoApplication.class, args);
	}
	
	/*Actuator are used for production support end point related task 
	 * some of the major end points that actuator exposes are -
	 * health - shows whether the server is un n running or not, db connection
	 * info - shows info about the rest endpoints
	 * env - jdk version, properties file used, class path, server ports
	 * trace - shows what request did the rest service served @ what time
	 * metrics-heap memory, free memory, last gc runtime etc...
	 * http://localhost:8080/env
	 * 
	 * There many HealIndicator interface (Elastick search, LDAP, DBconnectivity) you can override those
	 * Also can create CustomEndPoints to return a string, a entity, a list etc... - basically just create a rest endpoint
	 * 
	 */
	
}
