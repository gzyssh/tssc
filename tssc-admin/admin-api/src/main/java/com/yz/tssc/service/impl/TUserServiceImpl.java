package com.yz.tssc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yz.tssc.eneity.TUser;
import com.yz.tssc.mapper.TUserMapper;
import com.yz.tssc.service.ITUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
