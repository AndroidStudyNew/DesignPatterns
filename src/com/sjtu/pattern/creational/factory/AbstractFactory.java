package com.sjtu.pattern.creational.factory;

import com.sjtu.pattern.creational.factory.baseinterface.Provider;
import com.sjtu.pattern.creational.factory.baseinterface.Sender;
import com.sjtu.pattern.creational.factory.implement.MailSender;
import com.sjtu.pattern.creational.factory.implement.SmsSender;

/**
 * 第四种：抽象工厂模式（Abstract Factory）
 * 
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，
 * 必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，
 * 如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直 
 * 接增加新的工厂类就可以了，不需要修改之前的代码。因为抽象工厂不太好理解，我
 * 们先看看图，然后就和代码，就比较容易理解。
 * 
 * @author CharlesZhu
 * 
 */
public class AbstractFactory {

	/**
	 * 两个工厂类：
	 * 
	 * @author CharlesZhu
	 * 
	 */
	public static class SendMailFactory implements Provider {

		@Override
		public Sender produce() {
			return new MailSender();
		}
	}

	public static class SendSmsFactory implements Provider {

		@Override
		public Sender produce() {
			return new SmsSender();
		}
	}

	public static void main(String[] args) {
		Provider provider = new AbstractFactory.SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}

}
