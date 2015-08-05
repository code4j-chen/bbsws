package org.bbsws.dao.impl;

import java.util.List;

import org.bbsws.dao.ConfigDAOInterface;
import org.bbsws.po.ConfigPO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author ����
 * @version 1.0
 * ��̳���õ�DAOʵ����
 */
public class ConfigDAOImpl extends HibernateDaoSupport implements
		ConfigDAOInterface {
	/**
	 * ����id�õ���̳���ö���
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ConfigPO findById(String id) {
		getHibernateTemplate().setCacheQueries(true);
		getHibernateTemplate().setQueryCacheRegion("org.bbsws.po.ConfigPO");
		List<ConfigPO> list = getHibernateTemplate().find(
				"from ConfigPO where ID=?", id);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}
}