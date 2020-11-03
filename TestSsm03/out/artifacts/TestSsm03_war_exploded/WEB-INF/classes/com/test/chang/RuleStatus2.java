package com.test.chang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO
 *
 * @author lijinhe
 * @解释：
 * @date 2020/10/30 16:53
 */

public  class RuleStatus2 implements Serializable {
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

    public static RuleStatus2 succ(Object object){
         return succ(200,"操作成功",object);
     }

     public static RuleStatus2 succ (int code,String status,Object data){
            RuleStatus2 r= new RuleStatus2();
            r.setCode(code);
            r.setStatus(status);
            r.setData(data);
            return r;
     }

    public static RuleStatus2 fail (int code,String status,Object data){
        RuleStatus2 r= new RuleStatus2();
        r.setCode(code);
        r.setStatus(status);
        r.setData(data);
        return r;
    }
    public static RuleStatus2 fail (String status,Object data){
        RuleStatus2 r= new RuleStatus2();
        r.setCode(400);
        r.setStatus(status);
        r.setData(data);
        return r;
    }
    public static RuleStatus2 fail (String status){
        RuleStatus2 r= new RuleStatus2();
        r.setCode(400);
        r.setStatus(status);
        r.setData(null);
        return r;
    }

    @Override
    public String toString() {
        return "RuleStatus2{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}

