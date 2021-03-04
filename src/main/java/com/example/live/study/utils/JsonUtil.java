package com.example.live.study.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;

public class JsonUtil {

    public  static void writeResult(HttpServletResponse resp,String msg, long code, String method, JsonElement data) {
        JsonObject result = new JsonObject();
        result.addProperty("em",msg);
        result.addProperty("ec",code);
        result.addProperty("method",method);
        JsonObject list = new JsonObject();
        if (data != null)
            list.add("list",data);
            result.add("data",list);
        writeJson(resp,result);
    }

     /**
     * 通过HttpServletResponse 获取到输出流后，写出数据到客户端，也就是网页了
     * 写数据到浏览器上<br/>
     *
     * @param resp
     * @param json
     */
    public static void writeJson(HttpServletResponse resp, JsonObject json) {
        PrintWriter out = null;
        try {
            //设定类容为json的格式
            resp.setContentType("application/json;charset=UTF-8");
            out = resp.getWriter();
            //写到客户端
            out.write(json.toString());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
