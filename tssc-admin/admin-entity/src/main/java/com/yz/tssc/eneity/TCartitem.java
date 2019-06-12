package com.yz.tssc.eneity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TCartitem extends Model<TCartitem> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ct_id")
    private String ctId;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 图书ID
     */
    @TableField("bid")
    private String bid;

    /**
     * 用户ID
     */
    @TableField("uid")
    private String uid;


    @Override
    protected Serializable pkVal() {
        return this.ctId;
    }

}
