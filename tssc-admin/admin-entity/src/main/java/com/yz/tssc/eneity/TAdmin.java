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
 * 管理员表
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TAdmin extends Model<TAdmin> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("a_id")
    private String aId;

    /**
     * 用户名
     */
    @TableField("a_uname")
    private String aUname;

    /**
     * 密码
     */
    @TableField("a_pwd")
    private String aPwd;


    @Override
    protected Serializable pkVal() {
        return this.aId;
    }

}
