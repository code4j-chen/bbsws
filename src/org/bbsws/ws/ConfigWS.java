package org.bbsws.ws;

import org.bbsws.exception.BBSWSException;
import org.bbsws.factory.BeanXMLFactory;
import org.bbsws.service.ConfigServiceInterface;
import org.bbsws.vo.ConfigVO;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的WebService对应的Bean
 */
public class ConfigWS {
	private ConfigServiceInterface configServiceInterface = null;

	public ConfigWS() {
		configServiceInterface = BeanXMLFactory.getInstance()
				.getConfigService();
	}
	
	/**
	 * 根据id得到论坛配置对象
	 * @param id
	 * @return
	 * @throws BBSWSException
	 */
	public ConfigVO findById(String id) throws BBSWSException {
		return configServiceInterface.findById(id);
	}
}