package com.pigschool.xyzshow.common;

import com.alibaba.druid.support.json.JSONUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class JsonReturn {

    private Integer code;//成功为1

    private String msg;

    private Object data;

    public JsonReturn(Integer code){
        this.code = code;
    }

    public JsonReturn(Integer code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static JsonReturn success(Object obj,String msg){
        JsonReturn jsonReturn = new JsonReturn(1,msg,obj);
        return jsonReturn;
    }

    public static JsonReturn success(Object obj,CommonStatus status){
        JsonReturn jsonReturn = new JsonReturn(1,status.getText(),obj);
        return jsonReturn;
    }

    public static JsonReturn statusObj(Object obj,CommonStatus status){
        JsonReturn jsonReturn = new JsonReturn(status.getStatus(),status.getText(),obj);
        return jsonReturn;
    }

    public static JsonReturn success(Object obj){
        JsonReturn jsonReturn = new JsonReturn(1);
        jsonReturn.data = obj;
        return jsonReturn;
    }

    public static JsonReturn success(){
        return new JsonReturn(1);
    }

    public static JsonReturn fail(Integer code,String msg){
        JsonReturn jsonReturn = new JsonReturn(code);
        jsonReturn.msg = msg;
        return jsonReturn;
    }

    public static JsonReturn fail(CommonStatus status) {
        JsonReturn jsonReturn = fail(status.getStatus(),status.getText());
        return jsonReturn;
    }

    public Map<String , Object> toMap(){
        HashMap<String , Object> result = new HashMap<String , Object>();
        if (code != null){
            result.put("code",code);
        }
        if (msg != null){
            result.put("msg",msg);
        }
        if (data != null){
            result.put("data",data);
        }
        return  result;
    }

    public String toJson(){
        return JSONUtils.toJSONString(toMap());
    }

}
