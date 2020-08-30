package com.pro;

import org.springframework.stereotype.Service;

/**
 * @author sunlonglong
 * 7:42
 * 境由心生,事在人为
 */

@Service("eatinterImpl")
public class EatInterImpl implements IEatInter
{
    @Override
    public void eat(String name) {
        System.out.println(name + "--正在吃东西");
    }
}
