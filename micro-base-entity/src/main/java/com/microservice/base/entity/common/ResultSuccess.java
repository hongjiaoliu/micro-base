package com.microservice.base.entity.common;

public class ResultSuccess extends ResultBean {

    public Object getResult() {
        return super.getResult();
    }

    public void setResult(Object result) {
        super.setResult(result);
    }

    public ResultSuccess() {
        this.setStatus(true);
    }
    public ResultSuccess(Object result) {
        this.setStatus(true);
        super.setResult(result);
    }
}
