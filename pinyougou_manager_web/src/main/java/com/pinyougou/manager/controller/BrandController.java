package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}

	@RequestMapping("findPage")
	public PageResult findPage(int pageNum,int rows){
          return brandService.findPage(pageNum,rows);
	}

	@RequestMapping("add")
	public Result add(@RequestBody TbBrand tbBrand){
		try {
			brandService.add(tbBrand);
			return new Result(true,"添加品牌成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"添加品牌失败");
		}
	}

	@RequestMapping("update")
	public Result update(@RequestBody TbBrand tbBrand){
		try {
			brandService.update(tbBrand);
			return new Result(true,"更新品牌成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"更新品牌失败");
		}
	}

	@RequestMapping("findOne")
	public TbBrand findOne(Long id){
		TbBrand brand= brandService.findOne(id);
		return brand;
	}

	@RequestMapping("delete")
	public Result delete(Long[] ids){
		try {
			brandService.delete(ids);
			return new Result(true,"删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"删除失败");
		}
	}
	@RequestMapping("search")
	public PageResult search(@RequestBody TbBrand tbBrand,int pageNum,int rows){
		PageResult page = brandService.findPage(tbBrand, pageNum, rows);
		return new PageResult(page.getTotal(),page.getRows());
	}

	@RequestMapping("selectOptionList")
	public List<Map> selectOptionList(){
		return brandService.selectOptionList();
	}
}
