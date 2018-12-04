/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.william.dou.douuserservice.base;

import org.springframework.transaction.annotation.Transactional;

/**
 * Service基类
 */
@Transactional(readOnly = true)
public abstract class BaseService {

}
