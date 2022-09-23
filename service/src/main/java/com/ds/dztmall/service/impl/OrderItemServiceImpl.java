package com.ds.dztmall.service.impl;

import com.ds.dztmall.domain.OrderItem;
import com.ds.dztmall.mapper.OrderItemMapper;
import com.ds.dztmall.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项/快照  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
