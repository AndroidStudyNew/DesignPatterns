package com.sjtu.pattern.creational.builder;

/**
 * ConcreteBuilder
 * @author CharlesZhu
 *
 */
public class WomanBuilder implements PersonBuilder {
	Person person;
    public WomanBuilder() {
        person = new Person();
    }
    @Override
    public void buildHead() {
        person.setHead("建造女人的头");
        
    }
    @Override
    public void buildBody() {
        person.setBody("建造女人的身体");
        
    }
    @Override
    public void buildFoot() {
        person.setFoot("建造女人的脚");
        
    }
    @Override
    public Person buildPerson() {
        return person;
    }
    
}
