package com.sjtu.pattern.structural.adapter.classadapter;

/**
 * 类的适配器模式
 * 
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 *              通过Adapter类，将Source的功能扩展到Targetable里
 *              
 * @author CharlesZhu
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		 System.out.println("this is the targetable method!");  		
	}
	
	public static void main(String[] args) {  
		Targetable target = new Adapter();  
		target.method1();  
		target.method2();  
	}  

}
