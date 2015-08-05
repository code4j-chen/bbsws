package org.bbsws.service;

import org.bbsws.exception.BBSWSException;
import org.bbsws.vo.ConfigVO;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的服务实现接口
 */
public interface ConfigServiceInterface {
	/**
	 * 根据id得到论坛配置对象
	 * @param id
	 * @return
	 * @throws BBSWSException
	 */
	public ConfigVO findById(String id) throws BBSWSException;
}