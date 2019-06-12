package com.yz.tssc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yz.tssc.eneity.TCategory;
import com.yz.tssc.mapper.TCategoryMapper;
import com.yz.tssc.service.ITCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Service
public class TCategoryServiceImpl extends ServiceImpl<TCategoryMapper, TCategory> implements ITCategoryService {

}
