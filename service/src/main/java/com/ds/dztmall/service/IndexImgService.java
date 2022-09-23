package com.ds.dztmall.service;

import com.ds.dztmall.domain.IndexImg;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ReturnVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 轮播图  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public interface IndexImgService extends IService<IndexImg> {
    ReturnVO selectIndexImgs();
}
