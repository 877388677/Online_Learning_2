package com.ysc.apps.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.CourseChapter;
import com.ysc.apps.online.bean.extend.CourseChapterVM;
import com.ysc.apps.online.service.ICourseChapterService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/courseChapter")
public class CourseChapterController {
	
	@Autowired
	private ICourseChapterService chapterService;
	
	@GetMapping("findAllChapterVM")
	public MsgResponse findAllChapterVM(){
		try {
			List<CourseChapterVM> list = chapterService.findAllChapterVM();
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findChapterByIdVM")
	public MsgResponse findChapterByIdVM(Long id){
		try {
			CourseChapterVM list = new CourseChapterVM();
			//返回成功
			list=chapterService.findById(id);
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findChapterByKeywordVM")
	public MsgResponse findChapterByKeywordVM(String keywords){
		try {
			List<CourseChapterVM> list = chapterService.findByKeyword(keywords);
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@PostMapping("saveOrupdate")
	public MsgResponse saveOrUpdate(CourseChapter chapter){
		try{
			chapterService.saveOrUpdate(chapter);
			return MsgResponse.success("success", null);
		}catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteChapterById")
	public MsgResponse deleteChapterById(long id){
		try{
			chapterService.deleteById(id);
			return MsgResponse.success("success", null);
		}catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("batchDeleteChapter")
	public MsgResponse batchDeleteChapter(@RequestParam List<Long> ids){
		try{
			chapterService.batchDelete(ids);
			return MsgResponse.success("success", null);
		}catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	

}
