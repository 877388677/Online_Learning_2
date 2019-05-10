package com.ysc.apps.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.HomeworkQuestion;
import com.ysc.apps.online.bean.extend.HomeworkQuestionVM;
import com.ysc.apps.online.service.IHomeworkQuestionService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/homeworkQuestion")
public class HomeworkQuestionController {
	
	@Autowired
	private IHomeworkQuestionService questionService;
	
	@GetMapping("findAllByChapterid")
	public MsgResponse findAllByChapterid(@RequestParam long id){
		try {
			List<HomeworkQuestionVM> list = questionService.selectAllByChapterid(id);
			//返回成功信息
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			//返回失败信息
			return MsgResponse.error(e.getMessage());
		}
	} 
	
	@GetMapping("findAllQuestionVM")
	public MsgResponse findAllQuestionVM(){
		try {
			List<HomeworkQuestionVM> list = questionService.selectAll();
			//返回成功信息
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//返回失败信息
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("selectQuestionById")
	public MsgResponse selectQuestionById(@RequestParam long id){
		try {
			return MsgResponse.success("success", questionService.selectById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("queryKeywords")
	public MsgResponse queryKeywords(@RequestParam String keywords){
		try {
			List<HomeworkQuestionVM> list = questionService.query(keywords);
		    return MsgResponse.success("success", list);
		    
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	
	
	@GetMapping("deleteQuestionById")
	public MsgResponse deleteById(@RequestParam long id){
		try {
			questionService.deleteById(id);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("batchDelete")
	public MsgResponse batchDelete(Long[] ids){
		try {
			questionService.batchDelete(ids);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());		}
	}
	
	@PostMapping("saveOrUpdate")
	public MsgResponse saveOrUpdate(HomeworkQuestion question){
		try {
			questionService.saveOrUpdate(question);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
