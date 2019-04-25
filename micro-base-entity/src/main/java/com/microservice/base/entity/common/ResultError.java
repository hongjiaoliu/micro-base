
package com.microservice.base.entity.common;

public class ResultError extends ResultBean {
//    //内部错误码
//    private String errcode;
//    //错误描述
//    private String errmsg;
    public String getErrcode() {
        return super.getErrcode();
    }

    public void setErrcode(String errcode) {
        super.setErrcode(errcode);
    }

    public String getErrmsg() {
        return super.getErrmsg();
    }

    public void setErrmsg(String errmsg) {
        super.setErrmsg(errmsg);
    }

    public ResultError(String errcode) {
        this.setStatus(false);
        this.setErrcode(errcode);
    }
    /**
     * 错误结果
     * @param errcode 错误代码
     * @param errmsg 错误内容
     */
    public ResultError(String errcode,String errmsg) {
        this.setStatus(false);
        this.setErrcode(errcode);
        this.setErrmsg(errmsg);
    }
}
