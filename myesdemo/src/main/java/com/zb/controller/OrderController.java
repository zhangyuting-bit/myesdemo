package com.zb.controller;

import com.zb.pojo.Order;
import com.zb.pojo.Page;
import com.zb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
        @Autowired
        private OrderService orderService;

    @RequestMapping("show")
    public Page<Order> show(@RequestParam(value = "index",defaultValue = "1") Integer index,
                            @RequestParam(value = "key",required = false) String key,
                            @RequestParam(value = "type_level1",required = false) Integer type_level1,
                            @RequestParam(value = "type_level2",required = false) Integer type_level2,
                            @RequestParam(value = "type_level3",required = false) Integer type_level3,
                            @RequestParam(value = "min",required = false) Integer min,
                            @RequestParam(value = "max",required = false) Integer max) throws Exception{
        Integer size=3;
        Page<Order> orderByPage = orderService.findOrderByPage(index, size, key, type_level1, type_level2, type_level3, min, max);
        return orderByPage;
    }
}
