package com.pro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author sunlonglong
 * 7:41
 * 境由心生,事在人为
 */
public class ProviderMain {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("provider.xml");
        context.start();


        System.in.read();
    }
}
