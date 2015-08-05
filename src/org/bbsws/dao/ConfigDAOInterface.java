package org.bbsws.dao;

import org.bbsws.po.ConfigPO;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的DAO接口
 */
public interface ConfigDAOInterface {
	/**
	 * 根据id得到论坛配置对象
	 * @param id
	 * @return
	 */
	public ConfigPO findById(String id);
}