package org.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping(value = "/provider/testA")
    public String testA() {
        return "-------test A---------";
    }


    @GetMapping(value = "/provider/testB")
    public String testB() {
        return "-------test B---------";
    }

    @GetMapping(value = "/provider/testC")
    public String testC() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "-------test C 测试RT平均响应时间---------";
    }

    @GetMapping(value = "/provider/testD")
    public String testD() {
        int i = 10 / 0;
        return "-------test D 测试异常数和异常比例---------";
    }

    @GetMapping(value = "/provider/testHotKey")
    @SentinelResource(value = "testHotKey",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handleException")
    public String testHotKey(@RequestParam(value = "p1") String p1,
                             @RequestParam(value = "p2") String p2) {
        return "-------testHotKey 测试热点Key---------";
    }

}