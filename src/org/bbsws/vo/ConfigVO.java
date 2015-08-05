package org.bbsws.vo;

import java.io.Serializable;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的VO类
 */
public class ConfigVO implements Serializable {
	private static final long serialVersionUID = -8009999452113517734L;
	private String ID;
	private String confContext;

	public String getID() {
		return this.ID;
	}

	public void setID(String id) {
		this.ID = id;
	}

	public String getConfContext() {
		return confContext;
	}

	public void setConfContext(String confContext) {
		this.confContext = confContext;
	}
}