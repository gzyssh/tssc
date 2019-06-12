package com.yz.tssc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yz.tssc.eneity.TOrder;
import com.yz.tssc.mapper.TOrderMapper;
import com.yz.tssc.service.ITOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

}
