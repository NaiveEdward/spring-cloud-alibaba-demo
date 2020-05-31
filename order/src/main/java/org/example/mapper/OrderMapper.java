package org.example.mapper;

import org.example.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    /**
     * 新建订单
     */
    void create(Order order);

    /**
     * 修改订单状态，从零改为1
     */
    void updateStatus(@Param("userId") Long userId, @Param("status") Integer status);
}