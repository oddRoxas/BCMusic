package com.music.bcmusic.dao;

import com.music.bcmusic.domain.OrderCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import javax.persistence.Table;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.music.bcmusic.dao")
public class OrderCastMapperTest {

    @Autowired
    private OrderCartMapper orderCartMapper;

    @Test
    public void select()
    {

        Integer i=1;
        OrderCart a1=orderCartMapper.selectByPrimaryKey(i);

        assertNotNull(a1);
        System.out.println(a1.getUserId());

        assertEquals(i, a1.getUserId());
        System.out.println(a1.getUserId());



        List<OrderCart> all = orderCartMapper.selectAll();
        all = orderCartMapper.queryByUser(1);
        System.out.println(a1.getUserId());
        assertNotEquals(all.size(), 0);
    }


}
