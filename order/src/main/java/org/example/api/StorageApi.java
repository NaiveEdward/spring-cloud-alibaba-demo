package org.example.api;

import org.example.common.vo.BaseResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "storage-service")
public interface StorageApi {

    @PostMapping(value = "/storage/decrease")
    BaseResponseVO decrease(@RequestParam("productId") Long productId,
                            @RequestParam("count") Integer count);
}
