package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

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
	 * @param pageNum
	 * @param rows
	 * @return
	 */
	public PageResult findPage(int pageNum,int rows);

	/**
	 * 增加品牌
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);

	/**
	 * 更新品牌
	 * @param tbBrand
	 */
	public void update(TbBrand tbBrand);

	/**
	 * 通过id查找品牌
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);

	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long ids[]);

	/**
	 * 通过品牌名称搜索品牌
	 * @param tbBrand
	 * @param pageNum
	 * @param rows
	 * @return
	 */
    public PageResult findPage(TbBrand tbBrand,int pageNum,int rows);

	/**
	 * 获取品牌的下拉框列表
	 * @return
	 */
	public List<Map> selectOptionList();
	
}
