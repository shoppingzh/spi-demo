package com.littlezheng.log;

import com.littlezheng.Logger;

public class SimpleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("simple log console: " + msg);
    }
    
}
