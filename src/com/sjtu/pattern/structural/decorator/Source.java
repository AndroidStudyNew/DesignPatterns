package com.sjtu.pattern.structural.decorator;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");  		
	}

}
