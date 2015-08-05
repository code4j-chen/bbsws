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
 * @author ����
 * @version 1.0
 * ��̳���õķ���ʵ����
 */
public class ConfigServiceImpl implements ConfigServiceInterface {
	private Log log = LogFactory.getLog(ConfigServiceImpl.class);
	private ConfigDAOInterface configDao = null;

	public void setConfigDao(ConfigDAOInterface configDao) {
		this.configDao = configDao;
	}
	
	/**
	 * ����id�õ���̳���ö���
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
			log.error("����id�õ���̳���ö���ʱ�������󣬾�������Ϊ��", e);
		} catch (InvocationTargetException e) {
			log.error("����id�õ���̳���ö���ʱ�������󣬾�������Ϊ��", e);
		}
		return configVO;
	}
}