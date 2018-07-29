package com.mall.sellergoods.service;
import com.mall.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 白色馒头
 * Date: 2018-07-12
 * Time: 11:32
 */
public interface BrandService {
     List<TbBrand> findAll();
     PageResult findPage(int pageNum,int pageSize);


}
