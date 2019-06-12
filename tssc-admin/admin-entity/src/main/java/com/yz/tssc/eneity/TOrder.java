package com.yz.tssc.eneity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TOrder extends Model<TOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("o_id")
    private String oId;

    /**
     * 下单时间
     */
    @TableField("o_time")
    private String oTime;

    /**
     * 总计
     */
    @TableField("total")
    private BigDecimal total;

    /**
     * 订单状态 0:未付款  1:已付款未发货  2:已发货未确认收货  3:确认收货交易成功 4:已取消
     */
    @TableField("status")
    private Integer status;

    /**
     * 收货地址
     */
    @TableField("address")
    private String address;

    /**
     * 用户ID
     */
    @TableField("uid")
    private String uid;


    @Override
    protected Serializable pkVal() {
        return this.oId;
    }

}
