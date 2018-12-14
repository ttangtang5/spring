package com.tang.converter;

import com.tang.pojo.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/14 10:36
 * @Version 1.0
 **/
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj>{

    public MyMessageConverter(){
        super(new MediaType("application", "x-wisely", Charset.forName("utf-8")));
    }
    @Override
    protected boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(),Charset.forName("utf-8"));
        String[] tempArr = temp.split("-");
        return null;
    }

    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

    }
}
