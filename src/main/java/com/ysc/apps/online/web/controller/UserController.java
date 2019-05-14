package com.ysc.apps.online.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysc.apps.online.bean.User;
import com.ysc.apps.online.service.IUserService;
import com.ysc.apps.online.util.MsgResponse;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	
	@GetMapping("findAllUser") 
	public MsgResponse findAllUser(){
		try{
			List<User> list = userService.findAll();
			//返回成功信息
			return MsgResponse.success("success", list);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@PostMapping("/saveOrupdateUser")
	public MsgResponse saveOrUpdate(User user){
		if (user.getId()!=null){
			try {
				userService.saveOrUpdate(user);
				return MsgResponse.success("success", null);
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
		}
		else{
			try {
				userService.saveOrUpdate(user);
				return MsgResponse.success("success", null);
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
		}
	}
	
	
	
	@PostMapping("register")
	public MsgResponse register(User user){
		try {
			userService.register(user);
		//	System.out.println(MsgResponse.success("success", null));
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("error");
		}
	}
//	
//	@GetMapping("fingById")
//	public MsgResponse findById(long id){
//
//		try{
//		    
//			return MsgResponse.success("success", list);
//		}catch (Exception e){
//			e.printStackTrace();
//			return MsgResponse.error(e.getMessage());
//		}
//	}
	
	
	@RequestMapping("login")
	public String submitLogin(HttpSession session,HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username,password);
		boolean exist = userService.isExist(user);
		if(!exist){
			return "error";
		}
		return "success";
	}
	
	@GetMapping("deleteUserById")
	public MsgResponse deleteUserById(long id){
		try{
			userService.deleteById(id);
			return MsgResponse.success("success" , null);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error("error");
		}
	}
	
	
	@PostMapping("updateUser")
	public MsgResponse updateUser(User user){
		try {
			userService.update(user);
			return MsgResponse.success("success" , null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("error");
		}
	}
	
	@GetMapping("batchDelete")
	public MsgResponse batchDelete(@RequestParam List<Long> ids){
		try{
			userService.batchDelete(ids);
			return MsgResponse.success("success", null);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
