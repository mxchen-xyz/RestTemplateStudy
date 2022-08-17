package com.jincou.order.service.impl;

import com.jincou.common.domain.GoodsOrder;
import com.jincou.order.dao.OrderMapper;
import com.jincou.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 *  商品服务实现类
 *
 * @author xub
 * @date 2021/3/30 下午3:35
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public GoodsOrder findById(int orderId) {
        return orderMapper.findById(orderId);
    }

}
