package com.test.chang;

import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * TODO
 *
 * @author lijinhe
 * @解释：
 * @date 2020/10/30 16:53
 * 主要原因在于toString方法
 */

 public class RuleStatus{
    private   int code;
    private   String status;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public RuleStatus(int code, String status, Object data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public static RuleStatus succ (){
        return new RuleStatus(200,"成功",null);
    }
    public static RuleStatus fail (){
        return new RuleStatus(404,"失败",null);
    }

    @Override
    public  String toString() {
        return "RuleStatus{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}

