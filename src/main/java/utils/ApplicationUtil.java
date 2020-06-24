package utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuan
 * @project sivf_client
 * @description 获得上下文
 * @date 2020/6/24 15:45
 **/
public class ApplicationUtil {

    public static ClassPathXmlApplicationContext getApplicationXML() {

        return new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
}
