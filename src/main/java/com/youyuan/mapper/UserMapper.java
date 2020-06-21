package com.youyuan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youyuan.domain.User;
import org.springframework.stereotype.Repository;

/**
 * 类名称：UserMapper <br>
 * 类描述： 用户mapper接口 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/21 13:24<br>
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
