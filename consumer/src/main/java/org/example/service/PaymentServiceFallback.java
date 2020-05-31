package org.example.service;

import org.example.common.vo.BaseResponseVO;
import org.example.provider.vo.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFallback implements PaymentService {
    @Override
    public BaseResponseVO<Payment> getPayment(Long id) {
        return BaseResponseVO.fallback("服务降级返回,---PaymentServiceFallback",
                new Payment(id, "errorSerial"));
    }
}
