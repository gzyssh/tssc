package com.yz.tssc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yz.tssc.eneity.TAdmin;
import com.yz.tssc.mapper.TAdminMapper;
import com.yz.tssc.service.ITAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Service
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper, TAdmin> implements ITAdminService {

}
