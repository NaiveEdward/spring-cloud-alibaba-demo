package org.example.service;

import org.example.common.vo.BaseResponseVO;
import org.example.provider.vo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider", fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping(value = "/provider/payment/{id}")
    BaseResponseVO<Payment> getPayment(@PathVariable("id") Long id);
}
