package com.ysc.apps.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.CourseVideo;
import com.ysc.apps.online.bean.extend.CourseVideoVM;
import com.ysc.apps.online.service.ICourseVideoService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/courseVideo")
public class CourseVideoController {
	
	@Autowired
	private ICourseVideoService videoService;
	
	
	@GetMapping("deleteVideoById")
	public MsgResponse deleteVideoById(@RequestParam long id){
		try {
			videoService.deleteById(id);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("selectVideoById")
	public MsgResponse selectVideoById(@RequestParam long id){
		try {
			return MsgResponse.success("success", videoService.selectById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("batchDelete")
	public MsgResponse batchDelete(Long[] ids){
		try {
			videoService.batchDelete(ids);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());		
		}
	}
	
	@PostMapping("saveOrUpdate")
	public MsgResponse saveOrUpdate(CourseVideo video){
		try {
			videoService.saveOrUpdate(video);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findAllVideoVM")
	public MsgResponse findAllVideoVM(){
		try {
			List<CourseVideoVM> list = videoService.selectAll();
			//返回成功信息
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//返回失败信息
			return MsgResponse.error(e.getMessage());
		}
	}
}
