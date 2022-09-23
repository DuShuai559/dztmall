package com.ds.dztmall.service.impl;

import com.ds.dztmall.domain.Orders;
import com.ds.dztmall.mapper.OrdersMapper;
import com.ds.dztmall.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
