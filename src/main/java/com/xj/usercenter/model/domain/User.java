package com.xj.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    
    /**
     * 昵称
     */
    private String userName;
    
    /**
     * 账号
     */
    private String userAccount;
    
    /**
     * 头像
     */
    private String avatarUrl;
    
    /**
     * 性别
     */
    private Integer gender;
    
    /**
     * 密码
     */
    private String userPassword;
    
    /**
     * 电话
     */
    private String phone;
    
    /**
     * 邮箱
     */
    private String email;
    
    /**
     * 状态 0-正常
     */
    private Integer userStatus;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer isDelete;
    
    /**
     * 用户角色 0-普通用户 1-系统管理员
     */
    private Integer userRole;
    
    /**
     * 星球编号
     */
    private String planetCode;
    
    /**
     * 标签列表
     */
    private String tags;
    
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}