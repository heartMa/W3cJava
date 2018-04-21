/**
 * Copyright &copy; 2018-2030 <a href="http://www.w3cjava.com/">W3cjava</a> All rights reserved.
 */
package com.w3cjava.modules.test.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.w3cjava.common.json.AjaxJson;
import com.w3cjava.common.web.BaseController;
import com.w3cjava.modules.test.entity.Test;
import com.w3cjava.modules.test.service.TestService;

/**
 * 
 * @version v1.0.0
 * @author heartma
 * @date 2017年12月27日
 * @File UserController.java
 * @URL www.w3cjava.com
 * @Desc 用户Controller
 */
@Controller
@RequestMapping(value = "/test")
public class TestController extends BaseController {
	@Autowired
	private TestService systemService;

	@RequestMapping(value = { "get" })
	public String get(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required = false) String id) {
		if (org.apache.commons.lang3.StringUtils.isNotBlank(id)) {
			Test user = systemService.getUser(id);
			AjaxJson j = new AjaxJson();
			j.setSuccess(true);
			j.setMsg("获取当前信息成功");
			j.put("data", user);
			return renderString(response, j);
		} else {
			return null;
		}
	}

	@RequestMapping(value = { "index","" })
	public String index(Test user, Model model) {
		List<Test> list = systemService.findAllList(user);
		model.addAttribute("list", list);
		return "modules/test/test";
	}
	
	
	@RequestMapping(value={"delete"})
	public String delete(Test user){
		systemService.deleteUser(user);
		return null;
	}

}
