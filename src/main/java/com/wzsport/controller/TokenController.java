package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.service.TokenService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
* token资源的restful控制器
* 
* @author x1ny
* @date 2017年5月22日
*/
@Api(tags = "Token相关接口")
@RestController
@RequestMapping(value="/tokens",produces="application/json;charset=UTF-8")
public class TokenController {
	
//	private int status = 0;

	@Autowired
	private TokenService tokenService;
	
	/**
	* 验证username和password，创建token
	* 
	* @param username 用户名
	* @param password 密码
	* @param expiredHour 过期时间(小时)
	*/
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "创建token", notes = "验证用户名与密码，为用户创建一个用于鉴权的Token")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(
								@ApiParam("学校Id")
								@RequestParam long universityId,
								@ApiParam("用户名")
								@RequestParam String username,
								@ApiParam("密码")
								@RequestParam String password,
								@ApiParam("设备Id")
								@RequestParam String deviceId,
								@ApiParam("有效时间(单位:小时)，不填则默认为1")
								@RequestParam(required=false, defaultValue="1") Integer expiredHour,
								@RequestHeader("User-Agent") String userAgent
								) {
		System.out.println(userAgent);
		
		ResponseBody resBody = new ResponseBody();
		int status = tokenService.create(universityId, username, password, expiredHour, deviceId, userAgent, resBody);
		
		return ResponseEntity.status(status).body(resBody);
	}
}
