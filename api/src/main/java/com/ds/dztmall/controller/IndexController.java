package com.ds.dztmall.controller;

import com.ds.dztmall.vo.CategoryVO;
import com.ds.dztmall.vo.CategoryVO2;
import com.ds.dztmall.vo.ProductVO;
import com.ds.dztmall.service.CategoryService;
import com.ds.dztmall.service.IndexImgService;
import com.ds.dztmall.service.ProductService;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 轮播图  前端控制器
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@RestController
@CrossOrigin
@Api(tags = "首页相关接口")
@RequestMapping("/index")
public class IndexController {

    @Resource
    private IndexImgService indexImgService;

    @Resource
    private CategoryService categoryService;

    @Resource
    private ProductService productService;


    @ApiOperation(value = "轮播图信息接口")
    @GetMapping("imgs")
    public ReturnVO imgs(){
        return indexImgService.selectIndexImgs();
    }


    @ApiOperation(value = "商品分类接口")
    @GetMapping("categories")
    public ReturnVO categories(){
        List<CategoryVO> categories = categoryService.selectCategoryList();
        return new ReturnVO(ResponseStatus.SUCCESS, "success", categories);
    }

    @ApiOperation(value = "推荐商品接口")
    @GetMapping("recommend")
    public ReturnVO recommends(){
        List<ProductVO> recommendProducts = productService.selectPros();
        return new ReturnVO(ResponseStatus.SUCCESS, "success", recommendProducts);
    }


    @ApiOperation(value = "首页一级分类商品销量前6接口")
    @GetMapping("categoryProduct6")
    public ReturnVO categoryProduct6(){
        List<CategoryVO2> categoryVO2List = categoryService.selectFirstCategoryProduct6();
        return new ReturnVO(ResponseStatus.SUCCESS, "success", categoryVO2List);
    }
}
