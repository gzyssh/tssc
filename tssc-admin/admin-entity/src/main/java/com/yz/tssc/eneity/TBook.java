package com.yz.tssc.eneity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 图书表
 * </p>
 *
 * @author guozy
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TBook extends Model<TBook> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("bid")
    private String bid;

    /**
     * 图书名称
     */
    @TableField("bname")
    private String bname;

    /**
     * 作者
     */
    @TableField("author")
    private String author;

    /**
     * 定价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 售价
     */
    @TableField("curr_price")
    private BigDecimal currPrice;

    /**
     * 折扣
     */
    @TableField("discount")
    private BigDecimal discount;

    /**
     * 出版社
     */
    @TableField("press")
    private String press;

    /**
     * 出版时间
     */
    @TableField("publish_time")
    private String publishTime;

    /**
     * 版次
     */
    @TableField("edition")
    private Integer edition;

    /**
     * 页数
     */
    @TableField("page_num")
    private Integer pageNum;

    /**
     * 字数
     */
    @TableField("word_num")
    private Integer wordNum;

    /**
     * 印刷时间
     */
    @TableField("print_time")
    private String printTime;

    /**
     * 开本
     */
    @TableField("booksize")
    private Integer booksize;

    /**
     * 纸质
     */
    @TableField("paper")
    private String paper;

    /**
     * 分类ID
     */
    @TableField("cid")
    private String cid;

    /**
     * 大图
     */
    @TableField("image_w")
    private String imageW;

    /**
     * 小图
     */
    @TableField("image_b")
    private String imageB;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    @TableField("creater")
    private String creater;


    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}
