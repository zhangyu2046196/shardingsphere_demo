package com.youyuan.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 类名称：Udict <br>
 * 类描述：测试公共表 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/21 14:05<br>
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_udict")
public class Udict implements Serializable {
    private static final long serialVersionUID = 8838229258993631673L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
}
