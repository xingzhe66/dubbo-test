package com.pro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author sunlonglong
 * 20:56
 * 境由心生,事在人为
 */
public class ConsumerMain {



    public static void main(String[] args) {

        ClassPathXmlApplicationContext con =
                new ClassPathXmlApplicationContext("consumer.xml");
        con.start();

      sleepInter ter = (sleepInterImpl) con.getBean(sleepInterImpl.class);
      ter.toSleep("sunlonglong");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
