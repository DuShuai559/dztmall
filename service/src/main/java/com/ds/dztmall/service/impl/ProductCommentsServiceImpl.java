package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.dztmall.config.Constant;
import com.ds.dztmall.domain.ProductComments;
import com.ds.dztmall.vo.ProductCommentsVO;
import com.ds.dztmall.mapper.ProductCommentsMapper;
import com.ds.dztmall.service.ProductCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品评价  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class ProductCommentsServiceImpl extends ServiceImpl<ProductCommentsMapper, ProductComments> implements ProductCommentsService {

    @Resource
    private ProductCommentsMapper productCommentsMapper;

    @Override
    public ReturnVO selectCommentsByProId(String proId, Integer pageNo) {
        Integer startIndex = (pageNo - 1) * Constant.PAGE_SIZE;
        List<ProductCommentsVO> productCommentsVOS = productCommentsMapper.selectCommentsByProId(proId, startIndex, Constant.PAGE_SIZE);
        return new ReturnVO(ResponseStatus.SUCCESS, "success", productCommentsVOS);
    }

    @Override
    public ReturnVO selectCommentsInfo(String proId) {
        QueryWrapper<ProductComments> wrapper = new QueryWrapper<>();
        wrapper.eq("product_id", proId);
        // 总记录数
        Long totalRows = productCommentsMapper.selectCount(wrapper);

        wrapper.clear();
        wrapper.eq("comm_level", 1).eq("product_id", proId);
        // 好评数
        Long goodComm = productCommentsMapper.selectCount(wrapper);

        wrapper.clear();
        wrapper.eq("comm_level", 0).eq("product_id", proId);
        //中评数
        Long midComment = productCommentsMapper.selectCount(wrapper);

        wrapper.clear();
        wrapper.eq("comm_level", -1).eq("product_id", proId);
        // 差评数
        Long badComment = productCommentsMapper.selectCount(wrapper);

        // 好评率
        String goodCommProp = String.format("%.2f",goodComm * 1.0 / totalRows * 100);
        // 总页数
        Map<String, Object> map = new HashMap();
        map.put("totalRows",totalRows);
        map.put("goodComm",goodComm);
        map.put("midComm",midComment);
        map.put("badComm",badComment);
        map.put("goodCommProp",goodCommProp);
        map.put("pageSize",Constant.PAGE_SIZE);

        return new ReturnVO(ResponseStatus.SUCCESS, "success", map);
    }
}
