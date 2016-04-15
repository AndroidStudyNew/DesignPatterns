package com.sjtu.pattern.creational.builder;

/**
 * Director
 * @author CharlesZhu
 *
 */
public class PersonDirector {

	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
	
	
	 
}
