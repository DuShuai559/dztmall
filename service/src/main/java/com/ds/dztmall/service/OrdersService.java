package com.ds.dztmall.service;

import com.ds.dztmall.domain.Orders;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ReturnVO;

/**
 * <p>
 * 订单  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface OrdersService extends IService<Orders> {

    public ReturnVO addOrder(String cids, Orders orders);
}
