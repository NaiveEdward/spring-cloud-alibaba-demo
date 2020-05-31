package org.example.controller;

import org.example.common.vo.BaseResponseVO;
import org.example.entity.Order;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/create")
    public BaseResponseVO create(Order order) {
        orderService.create(order);
        return BaseResponseVO.success();
    }
}