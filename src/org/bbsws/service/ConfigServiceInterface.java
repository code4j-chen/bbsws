package org.bbsws.service;

import org.bbsws.exception.BBSWSException;
import org.bbsws.vo.ConfigVO;

/**
 * @author ����
 * @version 1.0
 * ��̳���õķ���ʵ�ֽӿ�
 */
public interface ConfigServiceInterface {
	/**
	 * ����id�õ���̳���ö���
	 * @param id
	 * @return
	 * @throws BBSWSException
	 */
	public ConfigVO findById(String id) throws BBSWSException;
}