package com.fruitmarket.controller;


import com.fruitmarket.bean.FruitItem;
import com.fruitmarket.common.Result;
import com.fruitmarket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/list")
    public Result<List<FruitItem>> list(){
        List<FruitItem> list = adminService.queryFruitItem();
        return Result.success(list);
    }

    @GetMapping("/search")
    public Result<List<FruitItem>> search(
            @RequestParam(required = false) String number,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String price,
            @RequestParam(required = false) String unit
    ){
        List<FruitItem> list = adminService.queryFruitItemForCon(number,name,price,unit);
        return Result.success(list);
    }

    @PostMapping("/add")
    public Result<String> add(@RequestBody FruitItem fruitItem){
        boolean success = adminService.addFruitItem(
                fruitItem.getNumber(),
                fruitItem.getName(),
                String.valueOf(fruitItem.getPrice()),
                fruitItem.getUnit()
        );
        if (success){
            return Result.success();
        }else {
            return Result.error("添加失败，水果编号已存在！");
        }
    }
}
