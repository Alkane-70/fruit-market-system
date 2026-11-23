package com.fruitmarket.service;


import com.fruitmarket.bean.FruitItem;
import com.fruitmarket.mapper.FruitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private FruitMapper fruitMapper;

    public List<FruitItem> queryFruitItem(){
        return fruitMapper.queryAllData();
    }

    public List<FruitItem> queryFruitItemForCon(String number,String name,String price,String unit){
        return fruitMapper.queryDataForCon(number,name,price,unit);
    }

    public boolean addFruitItem(String number,String name,String price,String unit){
        List<FruitItem> list = fruitMapper.queryAllData();
        for(FruitItem item : list){
            if(number.equals(item.getNumber())){
                return false;
            }
        }
        FruitItem fruitItem = new FruitItem(number,name,Double.parseDouble(price),unit);
        fruitMapper.addFruitItem(fruitItem);
        return true;
    }
}
