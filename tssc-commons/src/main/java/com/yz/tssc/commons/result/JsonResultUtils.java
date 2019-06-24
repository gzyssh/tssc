package com.yz.tssc.commons.result;

/**
 * <p>
 *
 * </p>
 *
 * @author guozy
 * @create 2019/06/24
 */
public class JsonResultUtils {
    public static JsonResult getSuccessJson(String message){
        JsonResult result = new JsonResult();
        result.setResult(JsonResult.SUCCESS);
        result.setMessage(message);
        return result;
    }

    public static JsonResult getObjectJson(Object object){
        JsonResult result = new JsonResult();
        result.setResult(JsonResult.SUCCESS);
        result.setData(object);
        return result;
    }

    public static JsonResult getSuccessJson(Object object,String message){
        JsonResult result = new JsonResult();
        result.setResult(JsonResult.SUCCESS);
        result.setMessage(message);
        result.setData(object);
        return result;

    }

    public static JsonResult getErrorJson(String message){
        JsonResult result = new JsonResult();
        result.setResult(JsonResult.ERROR);
        result.setMessage(message);
        return result;

    }

    public static JsonResult getErrorJson(String message,Object data){
        JsonResult result = new JsonResult();
        result.setResult(JsonResult.ERROR);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static JsonResult getErrorJson(String message,Object data,int code){
        JsonResult result = new JsonResult();
        result.setResult(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
