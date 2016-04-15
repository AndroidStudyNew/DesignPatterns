package com.sjtu.pattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 深拷贝：对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制
 * 
 * 把对象写到流里的过程是序列化(Serialization)过程； 而把对象从流中读出来的过程则叫反序列化(Deserialization)过程。
 * 应当指出的是，写到流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。
 * 
 * 在Java语言里深度克隆一个对象，常常可以先使对象实现Serializable接口，
 * 然后把对象（实际上只是对象的拷贝）写到一个流里（序列化），再从流里读回来（反序列化），便可以重建对象。
 * 
 * @author CharlesZhu
 * 
 */
public class DeepClone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int a;
	private String b;
	private int[] c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int[] getC() {
		return c;
	}

	public void setC(int[] c) {
		this.c = c;
	}

	public Object deepClone(Object src) {
		Object o = null;
		try {
			if (src != null) {
				// 将对象写到流里
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(src);
				oos.close();
				// 将对象从流里读出来
				ByteArrayInputStream bais = new ByteArrayInputStream(
						baos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bais);
				o = ois.readObject();
				ois.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return o;
	}

}
