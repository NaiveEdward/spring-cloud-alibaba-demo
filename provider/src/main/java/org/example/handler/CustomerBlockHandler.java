package org.example.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.common.vo.BaseResponseVO;

public class CustomerBlockHandler {
    public static BaseResponseVO handleException(BlockException exception) {
        return BaseResponseVO.fallback("自定义BlockHandler", exception);
    }
}
