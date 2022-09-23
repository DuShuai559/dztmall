package com.ds.dztmall.controller;

import com.ds.dztmall.domain.Product;
import com.ds.dztmall.domain.ProductParams;
import com.ds.dztmall.service.ProductCommentsService;
import com.ds.dztmall.service.ProductParamsService;
import com.ds.dztmall.service.ProductService;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 前端控制器
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@RestController
@CrossOrigin
@Api(tags = "商品相关接口")
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;
    @Resource
    private ProductParamsService productParamsService;
    @Resource
    private ProductCommentsService productCommentsService;

    @ApiOperation(value = "查询商品详细信息接口")
    @GetMapping("detail/{pid}")
    public ReturnVO detailProduct(@PathVariable @ApiParam(value = "商品ID") String pid){
        Map<String, Object> map = productService.detailProduct(pid);
        return new ReturnVO(ResponseStatus.SUCCESS, "SUCCESS", map);
    }

    @ApiOperation(value = "查询商品参数信息接口")
    @GetMapping("params/{pid}")
    public ReturnVO paramsProduct(@PathVariable @ApiParam(value = "商品id") String pid){
        ProductParams productParams = productParamsService.selectProParamsById(pid);
        if (productParams != null){
            return new ReturnVO(ResponseStatus.SUCCESS, "SUCCESS", productParams);
        }
        return new ReturnVO(ResponseStatus.FAIL, "三无产品", null);
    }

    @ApiOperation(value = "统计商品评论接口")
    @GetMapping("commentsInfo/{pid}")
    public ReturnVO commentsInfo(@PathVariable @ApiParam(value = "商品id") String pid){
        return productCommentsService.selectCommentsInfo(pid);
    }

    @ApiOperation(value = "查询商品评论信息接口")
    @GetMapping("comments/{pid}")
    public ReturnVO commentsProduct(@PathVariable @ApiParam(value = "商品id") String pid,
                                    @ApiParam(value = "页码", required = true) Integer pageNo){
        return productCommentsService.selectCommentsByProId(pid, pageNo);
    }


}
