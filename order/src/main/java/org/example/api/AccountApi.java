package org.example.api;

import org.example.common.vo.BaseResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "account-service")
public interface AccountApi {

    @PostMapping(value = "/account/decrease")
    BaseResponseVO decrease(@RequestParam("userId") Long userId,
                            @RequestParam("money") BigDecimal money);

}
