package com.sjtu.pattern.structural.adapter.objectadapter;

import com.sjtu.pattern.structural.adapter.classadapter.Source;
import com.sjtu.pattern.structural.adapter.classadapter.Targetable;

/**
 * 对象的适配器模式
 * 
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题。
 * 
 * @author CharlesZhu
 *
 */
public class Adapter implements Targetable {

    private Source source;  
      
    public Adapter(Source source){  
        super();  
        this.source = source;  
    }  
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

	
	public static void main(String[] args) {  
        Source source = new Source();  
        Targetable target = new Adapter(source);  
        target.method1();  
        target.method2();  
    }  
}
