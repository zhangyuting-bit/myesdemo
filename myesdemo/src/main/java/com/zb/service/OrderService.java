package com.zb.service;

import com.zb.pojo.Order;
import com.zb.pojo.Page;

public interface OrderService {

    public Page<Order> findOrderByPage(
            Integer index, Integer size, String key, Integer type_level1,
            Integer type_level2, Integer type_level3,
            Integer min, Integer max) throws Exception;

}
