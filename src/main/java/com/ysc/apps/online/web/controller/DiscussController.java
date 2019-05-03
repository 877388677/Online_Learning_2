package com.ysc.apps.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.Discuss;
import com.ysc.apps.online.bean.extend.DiscussVM;
import com.ysc.apps.online.service.IDiscussService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/discuss")
public class DiscussController {
	
	@Autowired
	private IDiscussService discussService;
	
	@GetMapping("findAllDiscussVM")
	public MsgResponse findAllDiscussVM(){
		try {
			List<DiscussVM> list = discussService.selectAll();
			//返回成功信息
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败信息
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("selectDiscussById")
	public MsgResponse selectDiscussById(@RequestParam long id){
		try {
			return MsgResponse.success("success", discussService.selectById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteDiscussById")
	public MsgResponse deleteDiscussById(@RequestParam long id){
		try {
			discussService.deleteById(id);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("batchDeleteDiscuss")
	public MsgResponse batchDeleteDiscuss(Long[] ids){
		try {
			discussService.batchDelete(ids);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());		
		}
	}
	
	@PostMapping("saveOrUpdateDiscuss")
	public MsgResponse saveOrUpdate(Discuss discuss){
		try {
			discussService.saveOrUpdate(discuss);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
