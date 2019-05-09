package com.ysc.apps.online.dao.extend;

import java.util.List;

import com.ysc.apps.online.bean.extend.DiscussVM;


public interface DiscussVMMapper {
	
			//查找所有
			List<DiscussVM> selectAll();
			
			//按id查找
			DiscussVM selectById(Long id);
			
			//根据视频id查找所有讨论
			List<DiscussVM> selectAllByVideoid(Long id);

}
