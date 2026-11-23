package com.fruitmarket.mapper;

import com.fruitmarket.bean.FruitItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FruitMapper {
    List<FruitItem> queryAllData();
    List<FruitItem> queryDataForCon(@Param("number") String number,@Param("name") String name,@Param("price") String price,@Param("unit") String unit);
    void addFruitItem(FruitItem fruitItem);
    void updateFruitItem(FruitItem fruitItem);
    void delFruitItem(String number);
}
