package com.zb.mapper;

import com.zb.pojo.Order;
import com.zb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class OrderMapper {
//    @Autowired
//    private OrderService orderService;
//
//    @RequestMapping("show")
//    public List<Order> show(@RequestParam(value = "index",defaultValue = "1") Integer index,
//                            @RequestParam(value = "size",defaultValue = "2") Integer size,
//                            @RequestParam(value = "key",required = false) String key,
//                            @RequestParam(value = "type_level1",required = false) Integer type_level1,
//                            @RequestParam(value = "type_level2",required = false) Integer type_level2,
//                            @RequestParam(value = "type_level3",required = false) Integer type_level3,
//                            @RequestParam(value = "min",required = false) Double min,
//                            @RequestParam(value = "max",required = false) Double max) throws Exception{
//        List<Order> orderByPage = orderService.findOrderByPage(index, size, key, type_level1, type_level2, type_level3, min, max);
//        return orderByPage;
//    }
}
