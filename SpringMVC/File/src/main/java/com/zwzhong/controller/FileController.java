package com.zwzhong.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.*;

@Controller
public class FileController {
    @RequestMapping("/fileDown")
    public ResponseEntity<byte[]> fileDown(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取静态资源的真实路径
        String realPath = servletContext.getRealPath("/static/img/logo.png");
        //创建输入流
         InputStream is = new FileInputStream(realPath);
        // 创建字节数组
        byte[]bytes=new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders响应头信息
        HttpHeaders headers = new HttpHeaders();
        ///设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=logo.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
    @RequestMapping("/upload")
    public String upload(){
        return "fileupload";
    }

    @ResponseBody
    @RequestMapping("/fileUpload")
    //上传的文件将会被解析为MultipartFile对象
    public String fileUpload(MultipartFile photo,HttpSession session) throws IOException {
        //获取文件的原始名字
        String filename = photo.getOriginalFilename();
        //获取服务器中photo目录的路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        File file=new File(photoPath);
        //如果文件不存在的话，创建目录
        if(!file.exists()){
            file.mkdir();
        }
        //文件分隔符("例如\")
        String finalPath=photoPath+File.separator+filename;
        //上传
        photo.transferTo(new File(finalPath));
        return "success";
    }
}
