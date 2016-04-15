package com.sjtu.pattern.creational.prototype;

public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepClone dc1 = new DeepClone();
		// 对dc1赋值
		dc1.setA(100);
		dc1.setB("clone1");
		dc1.setC(new int[] { 1000 });
		System.out.println("克隆前: dc1.a=" + dc1.getA());
		System.out.println("克隆前: dc1.b=" + dc1.getB());
		System.out.println("克隆前: dc1.c[0]=" + dc1.getC()[0]);
		System.out.println("-----------对克隆对象进行修改");
		DeepClone dc2 = (DeepClone) dc1.deepClone(dc1);
		// 对c2进行修改
		dc2.setA(50);
		dc2.setB("clone2");
		int[] a = dc2.getC();
		a[0] = 500;
		dc2.setC(a);
		System.out.println("克隆前: dc1.a=" + dc1.getA());
		System.out.println("克隆前: dc1.b=" + dc1.getB());
		System.out.println("克隆前: dc1.c[0]=" + dc1.getC()[0]);
		System.out.println("-----------");
		System.out.println("克隆后: dc2.a=" + dc2.getA());
		System.out.println("克隆后: dc2.b=" + dc2.getB());
		System.out.println("克隆后: dc2.c[0]=" + dc2.getC()[0]);
	}

}
