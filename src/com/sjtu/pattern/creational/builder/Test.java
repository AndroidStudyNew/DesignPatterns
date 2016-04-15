package com.sjtu.pattern.creational.builder;

public class Test {

	public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        
        System.out.println("---------做男人-------------");
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
        
        System.out.println("---------做女人-------------");
        person = pd.constructPerson(new WomanBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
	
}
