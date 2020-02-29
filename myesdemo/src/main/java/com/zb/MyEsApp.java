package com.zb;

import com.zb.pojo.Order;
import com.zb.pojo.Page;
import com.zb.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class MyEsApp {
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext run = SpringApplication.run(MyEsApp.class, args);
        OrderService bean = run.getBean(OrderService.class);
        Page<Order> orderByPage = bean.findOrderByPage(1, 2, "开发", null, null, null,null,null);
        for (Order order : orderByPage.getList()) {
            System.out.println(order);
            System.out.println(order.getId()+"\t"+order.getName()+"\t"+order.getTitle());
        }
        //mc_dev今天修改了pojo类aaaaaaa
    }
}
