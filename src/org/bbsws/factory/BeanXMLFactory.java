package org.bbsws.factory;

import org.bbsws.service.ConfigServiceInterface;
import org.bbsws.service.impl.ConfigServiceImpl;
import org.bbsws.util.ReadPropsFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 王举 
 * @version 1.0
 * Bean工厂类
 */
public class BeanXMLFactory {
	private final static BeanXMLFactory factory = new BeanXMLFactory();
	private ConfigServiceInterface configService = null;

	private BeanXMLFactory() {
		ReadPropsFile readPropsFile = new ReadPropsFile();
		String path = readPropsFile.getValue("project.path");
		ApplicationContext context = new FileSystemXmlApplicationContext(path
				+ "WebRoot/WEB-INF/BBSWSContext.xml");
		configService = (ConfigServiceImpl) context.getBean("configService");
	}

	public static BeanXMLFactory getInstance() {
		return factory;
	}

	public ConfigServiceInterface getConfigService() {
		return configService;
	}
}