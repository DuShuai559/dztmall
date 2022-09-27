package com.ds.dztmall.service;

import com.ds.dztmall.domain.UserAddr;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ReturnVO;

/**
 * <p>
 * 用户地址  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface UserAddrService extends IService<UserAddr> {

    ReturnVO getUserAddrs(Integer userId);
}
