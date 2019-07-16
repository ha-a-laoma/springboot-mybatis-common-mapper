package com.ham;

import com.ham.dao.MenuMapper;
import com.ham.pojo.Menu;
import com.ham.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@MapperScan("com.ham.dao")
//@ImportResource(locations = "classpath:resources/spring/application-dao.xml")
@RunWith(SpringRunner.class)
@SpringBootTest
public class App {

    @Autowired
    MenuMapper menuMapper;

    @Test
    public void aaa() {

        System.out.println("ok");
    }

    @Test
    public void findAll(){
        List<Menu> all = menuMapper.findAll();
        System.out.println(all);

//        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:templates/application-dao.xml");
//
//        HelloService menuMapper = (HelloService) xmlApplicationContext.getBean("helloService");
//        menuMapper.sayHello();
    }

}
