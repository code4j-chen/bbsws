package org.bbsws.dao;

import org.bbsws.po.ConfigPO;

/**
 * @author ����
 * @version 1.0
 * ��̳���õ�DAO�ӿ�
 */
public interface ConfigDAOInterface {
	/**
	 * ����id�õ���̳���ö���
	 * @param id
	 * @return
	 */
	public ConfigPO findById(String id);
}