package com.fit2cloud.qingcloud.wsclient;

public class QingCloudClientException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5562309362764717920L;
	
	public QingCloudClientException(String message, Throwable t) {
        super(message, t);
    }

    public QingCloudClientException(String message) {
        super(message);
    }

}
