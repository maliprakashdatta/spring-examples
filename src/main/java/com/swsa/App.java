package com.swsa;
import com.swsa.model.Address;
import com.swsa.model.City;
import com.swsa.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws BeansException {
        HelloService helloService=new HelloService();
        City city = new City();
        city.setName("Sangli");
        Address address = new Address(city);
        helloService.setName("Nirav");
        helloService.setAddress(address);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //HelloService helloService = (HelloService) context.getBean("helloService");
        //HelloService helloService = context.getBean("helloService", HelloService.class);

        helloService.sayHello();
    }
}
