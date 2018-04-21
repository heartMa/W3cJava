/**
 * Copyright &copy; 2018-2030 <a href="http://www.w3cjava.com/">W3cjava</a> All rights reserved.
 */
package com.w3cjava.modules.test.dao;

import com.w3cjava.common.persistence.CrudDao;
import com.w3cjava.common.persistence.annotation.MyBatisDao;
import com.w3cjava.modules.test.entity.Test;


/**
 * @version v1.0.0
 * @author heartma
 * @date 2017年12月27日
 * @File UserDao.java
 * @URL www.w3cjava.com
 * @Desc 用户DAO接口
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {

}
