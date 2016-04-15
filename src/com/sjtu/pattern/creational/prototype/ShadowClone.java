package com.sjtu.pattern.creational.prototype;

/**
 * 浅拷贝：对值类型的成员变量进行值的复制,对引用类型的成员变量只复制引用,不复制引用的对象
 * 
 * 浅拷贝运用：如果你改变一个非常基本类型的值时，原对象的值不要求改变时就用浅拷贝。
 * @author CharlesZhu
 *
 */
public class ShadowClone implements Cloneable {

	// 基本类型
	private int a;
	// 非基本类型
	private String b;
	// 非基本类型
	private int[] c;

	// 重写Object.clone()方法,并把protected改为public
	@Override
	public Object clone() {
		ShadowClone sc = null;
		try {
			sc = (ShadowClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sc;
	}

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

}
