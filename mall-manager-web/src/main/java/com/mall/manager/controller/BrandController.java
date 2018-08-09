package com.mall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mall.pojo.TbBrand;
import com.mall.sellergoods.service.BrandService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("findpage")
    public PageResult findPage(int pageNum,int pageSize){
      return brandService.findPage(pageNum,pageSize);
    }
    @RequestMapping("add")
    public Result add(@RequestBody TbBrand brand){
        try {
            brandService.add(brand);
            return new Result("Add Success",true);
        }catch (Exception e) {
            e.printStackTrace();
            return new Result("Add Error", false);
        }
    }
    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand){
        try {
            brandService.update(brand);
            return new Result("update success",true);
        }catch (Exception e){
            e.printStackTrace();
            return new Result("update error",false);
        }

    }
    @RequestMapping("findone")
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }
    @RequestMapping("delete")
    public Result delete(Long[] ids){
        try {
            brandService.delete(ids);
            return new Result("delete success",true);
        }catch (Exception e){
            e.printStackTrace();
            return new Result("delete error",false);
        }
    }
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand ,int page,int rows){
        return brandService.findPage(brand,page,rows);
    }


}
