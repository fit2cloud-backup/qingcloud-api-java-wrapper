package com.fit2cloud.qingcloud.wsclient;

public class QingCloudServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1254426809813519599L;
	
	private int statusCode;
	
	private String serviceName;

    private int errorCode;

    private String errorMessage;

    public QingCloudServiceException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public QingCloudServiceException(String errorMessage, Exception cause) {
        super(null, cause);
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getServiceName() {
	        return serviceName;
	}
	 
	public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

	public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
  
    public String getErrorMessage() {
        return errorMessage;
    }

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

    @Override
    public String getMessage() {
        return getErrorMessage()
            + "; Action : " + getServiceName()
            + "; Error Code: " + getErrorCode()
            + "; Error Message: " + getErrorMessage() + ")";
    }

}
