package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.dztmall.domain.UserAddr;
import com.ds.dztmall.mapper.UserAddrMapper;
import com.ds.dztmall.service.UserAddrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户地址  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class UserAddrServiceImpl extends ServiceImpl<UserAddrMapper, UserAddr> implements UserAddrService {

    @Resource
    private UserAddrMapper userAddrMapper;

    @Override
    public ReturnVO getUserAddrs(Integer userId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", userId);
        List<UserAddr> addrs = userAddrMapper.selectList(queryWrapper);
        return new ReturnVO(ResponseStatus.SUCCESS, "success", addrs);
    }
}
