package org.example.controller;

import org.example.common.vo.BaseResponseVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.env:}")
    private String env;

    @GetMapping(value = "/provider/config/env")
    public BaseResponseVO<String> getEnv() {
        return BaseResponseVO.success(env);
    }
}
