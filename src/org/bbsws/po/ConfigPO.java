package org.bbsws.po;

import java.io.Serializable;

/**
 * @author 王举
 * @version 1.0
 * 论坛配置的PO类
 */
public class ConfigPO implements Serializable {
	private static final long serialVersionUID = -1958045417839069291L;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result
				+ ((confContext == null) ? 0 : confContext.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ConfigPO other = (ConfigPO) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (confContext == null) {
			if (other.confContext != null)
				return false;
		} else if (!confContext.equals(other.confContext))
			return false;
		return true;
	}
}