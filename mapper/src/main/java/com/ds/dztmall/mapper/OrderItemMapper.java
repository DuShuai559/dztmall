package com.ds.dztmall.mapper;

import com.ds.dztmall.domain.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 订单项/快照  Mapper 接口
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface OrderItemMapper extends BaseMapper<OrderItem> {

    int insertMore(List<OrderItem> orderItemList);
}
