package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangwei
 * @version 1.0
 * Create by 2022/8/3 0:39
 */

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表
    public void saveWithFlavor(DishDto dishDto);
    //根据id来查寻菜品信息和口味信息
    public DishDto getByIdWithFlavor(Long id);
    //更新菜品信息同时更新口味信息
    //public void update(DishDto dishDto);
    @Transactional
    public void updateWithFlavor(DishDto dishDto);

    public void removeWithFlavor(List<Long> ids);
}
