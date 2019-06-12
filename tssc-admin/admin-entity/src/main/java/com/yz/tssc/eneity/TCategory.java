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
 * 分类表
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TCategory extends Model<TCategory> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("c_id")
    private String cId;

    /**
     * 分类名称
     */
    @TableField("cname")
    private String cname;

    /**
     * 父分类ID
     */
    @TableField("pid")
    private String pid;

    /**
     * 分类描述
     */
    @TableField("desc")
    private String desc;


    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

}
