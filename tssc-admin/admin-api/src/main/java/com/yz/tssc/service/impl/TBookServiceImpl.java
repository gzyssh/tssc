package com.yz.tssc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yz.tssc.eneity.TBook;
import com.yz.tssc.mapper.TBookMapper;
import com.yz.tssc.service.ITBookService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书表 服务实现类
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Service
public class TBookServiceImpl extends ServiceImpl<TBookMapper, TBook> implements ITBookService {

}
