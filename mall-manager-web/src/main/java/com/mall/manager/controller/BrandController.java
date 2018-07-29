package com.mall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mall.pojo.TbBrand;
import com.mall.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 白色馒头
 * Date: 2018-07-12
 * Time: 11:52
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;
    @RequestMapping("find")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
}
