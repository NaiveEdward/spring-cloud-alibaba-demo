package org.example.controller;

import org.example.common.vo.BaseResponseVO;
import org.example.provider.vo.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping(value = "/provider/payment/{id}")
    public BaseResponseVO<Payment> getPayment(@PathVariable("id") Integer id) {
        Payment payment = new Payment();
        payment.setId(1L);
        payment.setSerial("payment");

        return BaseResponseVO.success(payment);
    }
}
