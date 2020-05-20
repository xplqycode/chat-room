package com.pxu.chat.server.Test;

import org.springframework.stereotype.Component;

/**
 * @author 徐鹏
 * @date 2020/5/20 21:58
 */
@Component("hellwBean")
public class HelloSpring {
    public void test(){
        System.out.println("TestSpring");
    }
}
