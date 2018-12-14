package com.tang.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.*;


/**
 * @Description
 * @Author RLY
 * @Date 2018/12/13 13:41
 * @Version 1.0
 **/
@Controller
public class UploadController {

    @RequestMapping(value = "uploadAction", method = RequestMethod.POST)
    @ResponseBody
    public String uploadHandler(MultipartFile uploadFile, HttpServletRequest request) throws IOException {
        System.out.println(System.getProperty("sun.jnu.encoding"));
        System.setProperty("sun.jnu.encoding","utf-8");

        request.setCharacterEncoding("utf-8");

        String realPath = request.getServletContext().getRealPath("/WEB-INF/upload/");
        String fileName = new String(uploadFile.getOriginalFilename().getBytes("iso-8859-1"),"gbk");

        File file = new File(realPath + "/" +  fileName);

        //FileUtils.writeByteArrayToFile(file, uploadFile.getBytes());
        uploadFile.transferTo(file);

        //ServletInputStream is = null;
        //FileOutputStream os = null;
        //try {
        //    os = new FileOutputStream(file);
        //    is = request.getInputStream();
        //    //创建一个缓冲区
        //    byte buffer[] = new byte[1024];
        //    //判断输入流中的数据是否已经读完的标识
        //    int len = 0;
        //    //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
        //    while((len=is.read(buffer)) > 0){
        //        //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
        //        os.write(buffer, 0, len);
        //    }
        //    os.flush();
//
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}finally {
        //    is.close();
        //    os.close();
        //}

        return "success";
    }

    @RequestMapping(value = "upload")
    public String toUpload(){
        return "upload";
    }
}
