
package com.microservice.base.entity.common;

import java.io.Serializable;

public class ResultBean implements Serializable {
    private static final long serialVersionUID = -7492094070642651497L;
    //状态
    private boolean status;
    //结果
    private Object result;
    //内部错误码
    private String errcode;
    //错误描述
    private String errmsg;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
