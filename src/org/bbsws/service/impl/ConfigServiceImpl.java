package org.bbsws.service.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bbsws.dao.ConfigDAOInterface;
import org.bbsws.exception.BBSWSException;
import org.bbsws.po.ConfigPO;
import org.bbsws.service.ConfigServiceInterface;
import org.bbsws.vo.ConfigVO;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的服务实现类
 */
public class ConfigServiceImpl implements ConfigServiceInterface {
	private Log log = LogFactory.getLog(ConfigServiceImpl.class);
	private ConfigDAOInterface configDao = null;

	public void setConfigDao(ConfigDAOInterface configDao) {
		this.configDao = configDao;
	}
	
	/**
	 * 根据id得到论坛配置对象
	 * @param id
	 * @return
	 * @throws BBSWSException
	 */
	public ConfigVO findById(String id) throws BBSWSException {
		ConfigVO configVO = new ConfigVO();
		ConfigPO configPO = configDao.findById(id);
		try {
			BeanUtils.copyProperties(configVO, configPO);
		} catch (IllegalAccessException e) {
			log.error("根据id得到论坛配置对象时发生错误，具体内容为：", e);
		} catch (InvocationTargetException e) {
			log.error("根据id得到论坛配置对象时发生错误，具体内容为：", e);
		}
		return configVO;
	}
}