/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.william.dou.douuserservice.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Service基类
 * @author jeeplus
 * @version 2017-05-16
 */
@Transactional(readOnly = true, rollbackFor = Exception.class)
public abstract class CrudService<M extends BaseMapper<T>, T extends BaseEntity> extends BaseService {
	
	/**
	 * 持久层对象
	 */
	@Autowired
	protected M mapper;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id) {
		return mapper.get(id);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return mapper.get(entity);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return mapper.findList(entity);
	}

	/**
	 * 保存数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void save(T entity) {
		mapper.insert(entity);
	}

	/**
	 * 更新数据
	 * @param entity
	 */
	@Transactional(readOnly = false, rollbackFor = Exception.class)
	public void update(T entity) {
		mapper.update(entity);
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false, rollbackFor = Exception.class)
	public void delete(T entity) {
		mapper.delete(entity);
	}
	
	
	/**
	 * 删除全部数据
	 * @param entitys
	 */
	@Transactional(readOnly = false, rollbackFor = Exception.class)
	public void deleteAll(Collection<T> entitys) {
		for (T entity : entitys) {
			mapper.delete(entity);
		}
	}

	/**
	 * 删除全部数据
	 * @param entitys
	 */
	@Transactional(readOnly = false, rollbackFor = Exception.class)
	public void deleteAllByLogic(Collection<T> entitys) {
		for (T entity : entitys) {
			mapper.deleteByLogic(entity);
		}
	}

	
	/**
	 * 获取单条数据
	 * @param propertyName, value
	 * @return
	 */
	public T findUniqueByProperty(String propertyName, Object value){
		return mapper.findUniqueByProperty(propertyName, value);
	}

	/**
	 * 动态sql
	 * @param sql
	 */

	public List<Object> executeSelectSql(String sql){
		return mapper.execSelectSql(sql);
	}

	@Transactional(readOnly = false)
	public void executeInsertSql(String sql){
		mapper.execInsertSql(sql);
	}

	@Transactional(readOnly = false)
	public void executeUpdateSql(String sql){
		mapper.execUpdateSql(sql);
	}

	@Transactional(readOnly = false)
	public void executeDeleteSql(String sql){
		mapper.execDeleteSql(sql);
	}



}
