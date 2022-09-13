package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;
import com.itheima.reggie.mapper.OrdersMappper;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);
}
