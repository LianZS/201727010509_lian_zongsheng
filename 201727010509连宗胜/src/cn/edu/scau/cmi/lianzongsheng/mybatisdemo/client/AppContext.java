package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    private static ApplicationContext appContext;

    static {
        appContext = new ClassPathXmlApplicationContext("apptionContext.xml");
    }

    public static <T>T getBean(Class<T> t){
        return appContext.getBean(t);
    }
}
