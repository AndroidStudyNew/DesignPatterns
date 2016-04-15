package com.sjtu.pattern.creational.factory;

import com.sjtu.pattern.creational.factory.baseinterface.Sender;
import com.sjtu.pattern.creational.factory.implement.MailSender;
import com.sjtu.pattern.creational.factory.implement.SmsSender;

/**
 * 第二种:多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 * 
 * @author CharlesZhu
 * 
 */
public class MultipleFactoryMethod {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}

	public static void main(String[] args) {
		MultipleFactoryMethod factory = new MultipleFactoryMethod();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}
