package com.ysc.apps.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.HomeworkAnswer;
import com.ysc.apps.online.bean.extend.HomeworkAnswerVM;
import com.ysc.apps.online.service.IHomeworkAnswerService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/homeworkAnswer")
public class HomeworkAnswerController {
	
	@Autowired
	private IHomeworkAnswerService answerService;
	
	@GetMapping("findAllAnswerVM")
	public MsgResponse findAllAnswerVM(){
		try {
		List<HomeworkAnswerVM> list = answerService.selectAll();
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findAllAnswer")
	public MsgResponse findAllAnswer(){
		try {
		List<HomeworkAnswer> list = answerService.findAll();
			//返回成功
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	}

	 @PostMapping("saveOrUpdateAnswer")
	  public MsgResponse saveOrUpdateAnswer(HomeworkAnswer answer){
	  	try {
				answerService.saveOrUpdate(answer);
				return MsgResponse.success("success", null);
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error("error"+e.getMessage());
			}
	  }

	 @GetMapping("findAnswerById")
	  public MsgResponse findAnswerById(@RequestParam long id){

	  	try {
	  		answerService.findById(id);
	  		return MsgResponse.success("success",answerService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//返回失败
			return MsgResponse.error(e.getMessage());
		}
	  }
	 
	 @GetMapping("batchDelete")
	  public String batchDelete(@RequestParam List<Long> ids){
		  
	  	try {
	  		answerService.batchDelete(ids);
	  		return "删除成功!";
			} catch (Exception e) {
				e.printStackTrace();
				return "删除失败！"+e.getMessage();
			}
	  	
	  }
	 
	 @GetMapping("deleteAnswerById")
		public MsgResponse deleteAnswerById(long id){
			try{
				answerService.deleteById(id);
				return MsgResponse.success("success", null);
			}catch(Exception e){
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
		}
	 
}
