package com.ysc.apps.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.Course;
import com.ysc.apps.online.bean.extend.CourseVM;
import com.ysc.apps.online.service.ICourseService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("findAllCourseVM")
	public MsgResponse findAllCourseVM(){
		try {
			List<CourseVM> list = courseService.findAllVM();
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("findCourseByIdVM")
	public MsgResponse findCourseByIdVM(Long id){
		try {
			CourseVM list = new CourseVM();
			//返回成功
			list=courseService.findById(id);
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findCoursesByKeywordVM")
	public MsgResponse findCourseByKeywordVM(String keywords){
		try {
			List<CourseVM> list = courseService.findByKeyword(keywords);
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveOrupdate")
	public MsgResponse saveOrUpdate(Course course){
		try{
			courseService.saveOrUpdate(course);
			return MsgResponse.success("success", null);
		}catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteCourseById")
	public MsgResponse deleteCourseById(long id){
		try{
			courseService.deleteById(id);
			return MsgResponse.success("success", null);
		}catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("batchDeleteCourse")
	public MsgResponse batchDeleteCourse(@RequestParam List<Long> ids){
		try{
			courseService.batchDelete(ids);
			return MsgResponse.success("success", null);
		}catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
