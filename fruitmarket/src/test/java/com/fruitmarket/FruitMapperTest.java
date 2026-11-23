package com.fruitmarket;


import com.fruitmarket.bean.FruitItem;
import com.fruitmarket.mapper.FruitMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FruitMapperTest {
    @Autowired
    private FruitMapper fruitMapper;

    @Test
    public void testQueryAll(){
        List<FruitItem>list = fruitMapper.queryAllData();
        System.out.println("=====查询结果=====");
        for(FruitItem item : list){
            System.out.println(item);
        }
    }
}
