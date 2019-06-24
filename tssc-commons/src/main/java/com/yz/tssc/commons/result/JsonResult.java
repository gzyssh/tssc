package com.yz.tssc.commons.result;

import com.yz.tssc.commons.fastjson.WriteNullValueAsEmpty;

/**
 * <p>
 *
 * </p>
 *
 * @author guozy
 * @create 2019/06/24
 */

public class JsonResult {

    public final static int SUCCESS=1;
    public final static int ERROR=0;

    private int result;

    private String message;

    @WriteNullValueAsEmpty
    private Object data=new Object();


    public static int getSUCCESS() {
        return SUCCESS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
