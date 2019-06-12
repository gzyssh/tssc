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
 * 订单条目表
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TOrderitem extends Model<TOrderitem> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ot_id")
    private String otId;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 小计
     */
    @TableField("subtotal")
    private BigDecimal subtotal;

    /**
     * 图书ID
     */
    @TableField("bid")
    private String bid;

    /**
     * 图书名称
     */
    @TableField("bname")
    private String bname;

    /**
     * 售价
     */
    @TableField("curr_price")
    private BigDecimal currPrice;

    /**
     * 小图
     */
    @TableField("image_b")
    private String imageB;

    /**
     * 订单ID
     */
    @TableField("oid")
    private String oid;


    @Override
    protected Serializable pkVal() {
        return this.otId;
    }

}
