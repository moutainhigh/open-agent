package com.opencloud.agent.codec;

import java.io.Serializable;

/**
 * RPC Response
 */
public class RpcResponse implements Serializable {
    private static final long serialVersionUID = 8215493329459772524L;

    private String requestId;
    private String error;
    private Object result;

    public static RpcResponse fail() {
        RpcResponse response = new RpcResponse();
        response.setError("服务端挂断");
        return response;
    }

    public boolean isError() {
        return error != null;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}