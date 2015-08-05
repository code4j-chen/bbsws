package org.bbsws.ws.delegate;

import javax.jws.WebService;

import org.bbsws.exception.BBSWSException;
import org.bbsws.vo.ConfigVO;
import org.bbsws.ws.ConfigWS;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的WebService
 */
@WebService(targetNamespace = "http://ws.bbsws.org/", serviceName = "ConfigWSService", portName = "ConfigWSPort", wsdlLocation = "WEB-INF/wsdl/ConfigWSService.wsdl")
public class ConfigWSDelegate {
	ConfigWS configWS = new ConfigWS();

	public ConfigVO findById(String id) throws BBSWSException {
		return configWS.findById(id);
	}
}