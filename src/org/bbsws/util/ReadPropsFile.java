package org.bbsws.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author 王举
 * @version 1.0
 * 读取属性文件
 */
public class ReadPropsFile {
	private static Log log = LogFactory.getLog(ReadPropsFile.class);
	
	/**
	 * 根据给定的键得到值
	 * @param key
	 * @return
	 */
	public String getValue(String key) {
		Properties props = new Properties();
		try {
			props.load(getClass().getClassLoader().getResourceAsStream(
					"init.properties"));
		} catch (FileNotFoundException e) {
			log.error("文件不存在！");
		} catch (IOException e) {
			log.error("读取文件时发生错误，具体内容为：", e);
		}
		return props.getProperty(key);
	}
}