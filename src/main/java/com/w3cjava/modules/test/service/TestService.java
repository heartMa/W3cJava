/**
 * Copyright &copy; 2018-2030 <a href="http://www.w3cjava.com/">W3cjava</a> All rights reserved.
 */
package com.w3cjava.modules.test.service;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w3cjava.modules.test.dao.TestDao;
import com.w3cjava.modules.test.entity.Test;

/**
 * 
 * @version v1.0.0
 * @author heartma
 * @date 2017年12月27日
 * @File SystemService.java
 * @URL www.w3cjava.com
 * @Desc 系统管理，安全相关实体的管理类,包括用户、角色、菜单
 */
@Service
@Transactional(readOnly = true)
public class TestService implements InitializingBean {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	public static final int SALT_SIZE = 8;
	@Autowired
	private TestDao userDao;

	/**
	 * 获取用户
	 * 
	 * @param id
	 * @return
	 */
	public Test getUser(String id) {
		return userDao.get(id);
	}
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<Test> findAllList(Test user){
		List<Test> list = userDao.findAllList(user);
		return list;
	}
	
	/**
	 * 插入数据
	 * 
	 * @param user
	 */
	@Transactional(readOnly = false)
	public void saveUser(Test user) {
		userDao.insert(user);
	}

	@Transactional(readOnly = false)
	public void deleteUser(Test user) {
		userDao.delete(user);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}
}
