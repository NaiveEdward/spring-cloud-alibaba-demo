package org.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.common.vo.BaseResponseVO;
import org.example.provider.vo.Payment;
import org.example.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/{id}")
    @SentinelResource(value = "consumerPayment")
    public BaseResponseVO<Payment> getPayment(@PathVariable("id") Long id){
        return paymentService.getPayment(id);
    }

}
