package com.ysc.apps.online.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.Notices;
import com.ysc.apps.online.service.INoticesService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/notices")
public class NoticesController {
	
	@Autowired 
	private INoticesService noticesService;
	
	
	@GetMapping("findAllNotices")
	public MsgResponse findAllNotices(){
		try {
			List<Notices> list = noticesService.findAll();
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findNoticeById")
	public MsgResponse findNoticeById(long id){
		
		try{
			Notices list= new Notices();
			list=noticesService.findById(id);
			return MsgResponse.success("success", list);
		}catch (Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	//无法返回data
	@GetMapping("queryNotice")
	public MsgResponse queryNotice(String keywords){
		List<Notices> list= new ArrayList<>();
		try{
			list=noticesService.query(keywords);
			return MsgResponse.success("success", list);
		}catch (Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@PostMapping("/saveOrupdateNotice")
	public MsgResponse saveOrUpdate(Notices notices){
		if (notices.getId()!=null){
			try {
				noticesService.saveOrUpdate(notices);
				return MsgResponse.success("success", null);
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
		}
		else{
			try {
				noticesService.saveOrUpdate(notices);
				return MsgResponse.success("success", null);
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
		}
	}
	
	
	@GetMapping("deleteNoticeById")
	public MsgResponse deleteNoticeById(long id){
		try{
			noticesService.deleteById(id);
			return MsgResponse.success("success", null);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("batchDelete")
	public MsgResponse batchDelete(@RequestParam List<Long> ids){
		try{
			noticesService.batchDelete(ids);
			return MsgResponse.success("success", null);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	

}
