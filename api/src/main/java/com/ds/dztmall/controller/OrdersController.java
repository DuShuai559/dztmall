package com.ds.dztmall.controller;

import com.ds.dztmall.domain.Orders;
import com.ds.dztmall.mapper.OrdersMapper;
import com.ds.dztmall.service.OrdersService;
import com.ds.dztmall.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 订单  前端控制器
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@RestController
@RequestMapping("/orders")
@CrossOrigin
@Api(tags = "订单相关接口")
public class OrdersController {

    @Resource
    private OrdersService ordersService;

    @ApiOperation(value = "添加订单接口")
    @PostMapping("addOrder")
    public ReturnVO addOrder(String cids, @RequestBody Orders orders){
        return ordersService.addOrder(cids, orders);
    }
}

