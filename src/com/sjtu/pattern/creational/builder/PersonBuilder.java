package com.sjtu.pattern.creational.builder;

public interface PersonBuilder {
	void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
