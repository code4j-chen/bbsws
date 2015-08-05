package org.bbsws.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author ����
 * @version 1.0
 * ��ȡ�����ļ�
 */
public class ReadPropsFile {
	private static Log log = LogFactory.getLog(ReadPropsFile.class);
	
	/**
	 * ���ݸ����ļ��õ�ֵ
	 * @param key
	 * @return
	 */
	public String getValue(String key) {
		Properties props = new Properties();
		try {
			props.load(getClass().getClassLoader().getResourceAsStream(
					"init.properties"));
		} catch (FileNotFoundException e) {
			log.error("�ļ������ڣ�");
		} catch (IOException e) {
			log.error("��ȡ�ļ�ʱ�������󣬾�������Ϊ��", e);
		}
		return props.getProperty(key);
	}
}