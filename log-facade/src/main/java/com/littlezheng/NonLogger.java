package com.littlezheng;

public class NonLogger implements Logger{
    
    private static final Logger INSTANCE = new NonLogger();
    
    private NonLogger() {
        System.err.println("û���ҵ���־ʵ�֣�");
    }

    @Override
    public void log(String msg) {
        //do nothing
    }
    
    public static Logger getInstance(){
        return INSTANCE;
    }

}
