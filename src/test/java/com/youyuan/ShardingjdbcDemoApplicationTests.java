package com.youyuan;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.youyuan.domain.Cource;
import com.youyuan.domain.Udict;
import com.youyuan.domain.User;
import com.youyuan.mapper.CourceMapper;
import com.youyuan.mapper.UdictMapper;
import com.youyuan.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingjdbcDemoApplicationTests {

    @Autowired
    private CourceMapper courceMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UdictMapper udictMapper;

    /**
     * 测试水平分表保存数据
     */
    @Test
    void contextLoads() {
        for (int i = 1; i <= 10; i++) {
            Cource cource = Cource.builder()
                    .addTime(new Date())
                    .age(new Random().nextInt(90))
                    .name("北京" + i)
                    .userId(100L)
                    .build();
            courceMapper.insert(cource);
        }
    }

    /**
     * 测试水平分表查询数据
     */
    @Test
    void findById() {
        QueryWrapper<Cource> courceQueryWrapper = new QueryWrapper<>();
        courceQueryWrapper.eq("id", 1274540534295240706L);
        Cource cource = courceMapper.selectOne(courceQueryWrapper);
        System.out.println("cource:" + cource);
    }

    /**
     * 测试水平分库分表保存数据
     */
    @Test
    void addDatabaseCource() {
        for (int i = 1; i <= 10; i++) {
            Cource cource = Cource.builder()
                    .name("java" + i)
                    .age(new Random().nextInt(100))
                    .userId((long) new Random().nextInt(100))
                    .addTime(new Date())
                    .build();
            courceMapper.insert(cource);
        }
    }

    /**
     * 测试水平分库分表查询
     */
    @Test
    void findCourceById() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 1274564903792865282L);
        queryWrapper.eq("user_id", 86L);
        Cource cource = courceMapper.selectOne(queryWrapper);
        System.out.println("cource:" + cource);
    }

    /**
     * 测试垂直分库保存数据
     */
    @Test
    void addUser() {
        for (int i = 1; i <= 10; i++) {
            User user = User.builder()
                    .name("北京" + i)
                    .station("开发")
                    .age(new Random().nextInt(100))
                    .addTime(new Date())
                    .build();
            userMapper.insert(user);
        }
    }

    /**
     * 测试垂直分库查询数据
     */
    @Test
    void findUserById() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1274575533232967681L);
        User user = userMapper.selectOne(wrapper);
        System.out.println("user:" + user);
    }

    /**
     * 保存字典数据
     */
    @Test
    void addUdict() {
        for (int i = 1; i <= 10; i++) {
            Udict udict = Udict.builder()
                    .name("字典类型数据" + i)
                    .build();
            udictMapper.insert(udict);
        }
    }

    /**
     * 查询字典数据
     */
    @Test
    void findUdict() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1274587757204791298L);
        Udict udict = udictMapper.selectOne(wrapper);
        System.out.println("udict:" + udict);
    }

    /**
     * 删除字典数据
     */
    @Test
    void delUdict() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1274587757146071041L);
        udictMapper.delete(wrapper);
    }

}
