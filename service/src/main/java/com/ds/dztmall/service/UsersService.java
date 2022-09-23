package com.ds.dztmall.service;

import com.ds.dztmall.domain.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ReturnVO;

/**
 * <p>
 * 用户  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface UsersService extends IService<Users> {

    ReturnVO login(String username, String password);

    ReturnVO registry(String username, String password);
}
