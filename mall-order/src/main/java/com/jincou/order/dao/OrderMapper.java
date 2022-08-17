package com.jincou.order.dao;

import com.jincou.common.domain.Goods;
import com.jincou.common.domain.GoodsOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *  查询商品信息
 *
 * @author xub
 * @date 2021/3/30 下午3:28
 */
@Repository
public interface OrderMapper {

    @Select("select * from goods_order where id=#{orderId}")
    GoodsOrder findById(@Param("orderId") int orderId);

}
