package com.sjtu.pattern.creational.factory.implement;

import com.sjtu.pattern.creational.factory.baseinterface.Sender;

/**
 * Created by CharlesZhu on 2016/4/15.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
