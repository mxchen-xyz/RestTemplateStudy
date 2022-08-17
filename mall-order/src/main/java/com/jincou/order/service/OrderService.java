package com.jincou.order.service;

import com.jincou.common.domain.Goods;
import com.jincou.common.domain.GoodsOrder;

/**
 *  商品相关实现类
 *
 * @author xub
 * @date 2021/3/30 下午3:32
 */
public interface OrderService {

    /**
     * 获取商品信息
     */
    GoodsOrder findById(int goodsId);
}
