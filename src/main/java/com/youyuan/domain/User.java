package com.youyuan.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 类名称：User <br>
 * 类描述：测试垂直分库 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/21 13:22<br>
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = -5400575090584431032L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 岗位
     */
    private String station;
    /**
     * 时间
     */
    private Date addTime;
}
