package org.learn.english.rest.data.rs;

/**
 * Базовый ответ
 * Created by kalyashov-ga on 2020-02-05.
 */
public class BaseResponse {

    private String status;
    private Integer code;

    public BaseResponse() {
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
