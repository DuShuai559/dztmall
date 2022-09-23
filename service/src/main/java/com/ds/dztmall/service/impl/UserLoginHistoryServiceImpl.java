package com.ds.dztmall.service.impl;

import com.ds.dztmall.domain.UserLoginHistory;
import com.ds.dztmall.mapper.UserLoginHistoryMapper;
import com.ds.dztmall.service.UserLoginHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录历史表  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class UserLoginHistoryServiceImpl extends ServiceImpl<UserLoginHistoryMapper, UserLoginHistory> implements UserLoginHistoryService {

}
