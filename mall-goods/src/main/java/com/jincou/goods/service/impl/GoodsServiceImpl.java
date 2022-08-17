package com.jincou.goods.service.impl;


import com.jincou.common.domain.Goods;
import com.jincou.goods.dao.GoodsMapper;
import com.jincou.goods.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 *  商品服务实现类
 *
 * @author xub
 * @date 2021/3/30 下午3:35
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper videoMapper;

    @Override
    public Goods findById(int goodsId) {
        return videoMapper.findById(goodsId);
    }

}
