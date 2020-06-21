package com.youyuan.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 类名称：Cource <br>
 * 类描述： 科目实体类 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/20 21:40<br>
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cource implements Serializable {
    private static final long serialVersionUID = -2626059413218350916L;

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
     * 用户
     */
    private Long userId;
    /**
     * 时间
     */
    private Date addTime;
}
