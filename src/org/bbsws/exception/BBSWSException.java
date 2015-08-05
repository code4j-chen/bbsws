package org.bbsws.exception;

/**
 * @author 王举
 * @version 1.0 
 * 自定义异常类
 */
public class BBSWSException extends Exception {
	private static final long serialVersionUID = -8012265954238533617L;

	public BBSWSException() {
		super();
	}

	public BBSWSException(String message) {
		super(message);
	}

	public BBSWSException(String message, Throwable cause) {
		super(message, cause);
	}

	public BBSWSException(Throwable cause) {
		super(cause);
	}
}