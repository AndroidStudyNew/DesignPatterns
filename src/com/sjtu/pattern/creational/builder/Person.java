package com.sjtu.pattern.creational.builder;

/**
 * 构造者模式
 * 模式的结构中包括四种角色：
 * 1产品（Product）
 * 2抽象生成器（Builder）
 * 3具体生成器（ConcreteBuilder）
 * 4指挥者（Director）
 * 
 * 例如：
 * Product -> Person
 * 
 * @author CharlesZhu
 *
 */
public class Person {

	 private String head;
	    private String body;
	    private String foot;
	    public String getHead() {
	        return head;
	    }
	    public void setHead(String head) {
	        this.head = head;
	    }
	    public String getBody() {
	        return body;
	    }
	    public void setBody(String body) {
	        this.body = body;
	    }
	    public String getFoot() {
	        return foot;
	    }
	    public void setFoot(String foot) {
	        this.foot = foot;
	    }
	    
}
