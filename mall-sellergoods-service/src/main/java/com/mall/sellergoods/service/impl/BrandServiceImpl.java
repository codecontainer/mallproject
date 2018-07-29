package com.mall.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mall.mapper.TbBrandMapper;
import com.mall.pojo.TbBrand;
import com.mall.sellergoods.service.BrandService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 白色馒头
 * Date: 2018-07-12
 * Time: 11:36
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper tbBrandMapper;
    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        return null;
    }


}
