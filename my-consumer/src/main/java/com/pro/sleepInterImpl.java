package com.pro;


import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sunlonglong
 * 20:58
 * 境由心生,事在人为
 */

@Service
public class sleepInterImpl implements sleepInter {

    @Resource
    private EatInterImpl eatInter;

    public void toSleep(String name) {
      //  System.out.println(name + "--开始睡觉了");
        eatInter.eat("sunlonglong");
    }
}
