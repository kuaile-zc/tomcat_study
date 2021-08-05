package com.demo.tomcat.ex02;

import java.io.IOException;

/**
 * @author CoreyChen Zhang
 * @date 2021/7/30 17:35
 * @modified
 */
public class StaticResourceProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
