package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {
	/**
	 * 查询所有品牌信息
	 * @return
	 */
	public List<TbBrand> findAll();

	/**
	 * 分页功能实现
	 * @param page
	 * @param rows
	 * @return
	 */
	public PageResult findPage(Integer page,Integer rows);



	
}
