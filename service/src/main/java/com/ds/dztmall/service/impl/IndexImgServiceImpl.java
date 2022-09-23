package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.dztmall.domain.IndexImg;
import com.ds.dztmall.mapper.IndexImgMapper;
import com.ds.dztmall.service.IndexImgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 轮播图  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class IndexImgServiceImpl extends ServiceImpl<IndexImgMapper, IndexImg> implements IndexImgService {

    @Resource
    private IndexImgMapper indexImgMapper;

    /**
     * 查询轮播图信息
     * @return
     */
    @Override
    public ReturnVO selectIndexImgs() {
        QueryWrapper<IndexImg> queryWrapper = new QueryWrapper<>();
        // 查询status不等于0的，按seq升序排序
        queryWrapper.ne("status", 0).orderByAsc("seq");
        List<IndexImg> indexImgs = indexImgMapper.selectList(queryWrapper);
        if (indexImgs.size() == 0){
            return new ReturnVO(ResponseStatus.FAIL, "未查询到轮播图信息", null);
        }
        return new ReturnVO(ResponseStatus.FAIL, "success", indexImgs);
    }
}
