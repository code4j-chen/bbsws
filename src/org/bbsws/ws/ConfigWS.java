package org.bbsws.ws;

import org.bbsws.exception.BBSWSException;
import org.bbsws.factory.BeanXMLFactory;
import org.bbsws.service.ConfigServiceInterface;
import org.bbsws.vo.ConfigVO;

/**
 * @author ����
 * @version 1.0
 * ��̳���õ�WebService��Ӧ��Bean
 */
public class ConfigWS {
	private ConfigServiceInterface configServiceInterface = null;

	public ConfigWS() {
		configServiceInterface = BeanXMLFactory.getInstance()
				.getConfigService();
	}
	
	/**
	 * ����id�õ���̳���ö���
	 * @param id
	 * @return
	 * @throws BBSWSException
	 */
	public ConfigVO findById(String id) throws BBSWSException {
		return configServiceInterface.findById(id);
	}
}