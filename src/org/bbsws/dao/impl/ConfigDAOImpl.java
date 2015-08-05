package org.bbsws.dao.impl;

import java.util.List;

import org.bbsws.dao.ConfigDAOInterface;
import org.bbsws.po.ConfigPO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的DAO实现类
 */
public class ConfigDAOImpl extends HibernateDaoSupport implements
		ConfigDAOInterface {
	/**
	 * 根据id得到论坛配置对象
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