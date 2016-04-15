package com.sjtu.pattern.creational.singleton;

/**
 * 单例对象（Singleton）是一种常用的设计模式。 在Java应用中，
 * 单例对象能保证在一个JVM中，该对象只有一个实例存在。
 * 
 * @author CharlesZhu
 * 
 */
public class SimpleSingleton {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static SimpleSingleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private SimpleSingleton() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    public static SimpleSingleton getInstance() {  
        if (instance == null) {  
            instance = new SimpleSingleton();  
        }  
        return instance;  
    }  
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    } 

}
