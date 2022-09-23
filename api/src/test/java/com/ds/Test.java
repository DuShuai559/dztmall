package com.ds;

import com.ds.dztmall.mapper.ProductCommentsMapper;
import com.ds.dztmall.mapper.ShoppingCartMapper;
import com.ds.dztmall.vo.ShoppingCartVO;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: DuShuai
 * CreateTime: 2022/09/14 9:43
 * Function: please enter
 */
@SpringBootTest(classes = ApiApplication.class)
public class Test {

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

//    @org.junit.jupiter.api.Test
//    public void test(){
//        List<ShoppingCartVO> shoppingCartVOS = shoppingCartMapper.selectShopCartByUserId(9);
//        System.out.println(shoppingCartVOS);
//    }
}
