package com.wzsport.controller;

import java.io.File;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.util.PathUtil;

@RestController()
@RequestMapping(value = "/downloads",produces = "application/json;charset=UTF-8")
public class DownloadController {

	@RequestMapping(value = { "/file" }, method = RequestMethod.GET)
	public ResponseEntity<byte[]> fileDownload(HttpServletResponse response, 
	        HttpServletRequest request, @RequestParam String fileName) throws Exception {
	    // 指定要下载的文件所在路径
	    String path =  File.separator + PathUtil.FILE_STORAGE_PATH;
	    System.out.println(PathUtil.ORIGIN);
	    // 创建该文件对象
	    File file = new File(path + File.separator + fileName);
	    // 对文件名编码，防止中文文件乱码
	    fileName = this.getFilename(request, fileName);
	    // 设置响应头
	    HttpHeaders headers = new HttpHeaders();
	    // 通知浏览器以下载的方式打开文件
	    headers.setContentDispositionFormData("attachment", fileName);
	    // 定义以流的形式下载返回文件数据
	    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	    // 设置相应内容的长度
        headers.setContentLength(file.length());
        
	    return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
	}
	
	/** * 根据浏览器的不同进行编码设置，返回编码后的文件名 */
	String getFilename(HttpServletRequest request, String filename) throws Exception {
	    // IE不同版本User-Agent中出现的关键词
	    String[] IEBrowserKeyWords = {"MSIE", "Trident", "Edge"};
	    // 获取请求头代理信息
	    String userAgent = request.getHeader("User-Agent");
	    for (String keyWord : IEBrowserKeyWords) {
	        if (userAgent.contains(keyWord)) {
	            //IE内核浏览器，统一为UTF-8编码显示
	            return URLEncoder.encode(filename, "UTF-8");
	        }
	    }
	    //火狐等其它浏览器统一为ISO-8859-1编码显示
	    return new String(filename.getBytes("UTF-8"), "ISO-8859-1");
	}
	
}
