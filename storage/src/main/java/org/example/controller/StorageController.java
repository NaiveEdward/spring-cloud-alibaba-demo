package org.example.controller;

import org.example.common.vo.BaseResponseVO;
import org.example.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/decrease")
    public BaseResponseVO decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);

        return BaseResponseVO.success();
    }

}
