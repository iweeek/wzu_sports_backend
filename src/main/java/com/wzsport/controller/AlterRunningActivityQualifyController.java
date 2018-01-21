package com.wzsport.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.EditQualifiedMapper;
import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.model.EditQualified;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.model.StudentExample.Criteria;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "修改RunningActivity达标结果接口")
@RestController()
@RequestMapping(value = "/editQualified",produces = "application/json;charset=UTF-8")
public class AlterRunningActivityQualifyController {
	
	@Autowired
	private RunningActivityMapper runningActivityMapper;
	
	@Autowired
	private EditQualifiedMapper editQualifiedMapper;
	@ApiOperation(value = "修改RunningActivity", notes = "修改跑步运动达标结果")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> alter(
								@ApiParam("运动记录id") 
								@RequestParam long runningActivityId,
								@ApiParam("修改者姓名")
								@RequestParam String username,
								@ApiParam("修改者id")
								@RequestParam long userId,
								@ApiParam("备注信息")
								@RequestParam String remarks) {
		RunningActivity runningActivity = runningActivityMapper.selectByPrimaryKey(runningActivityId);
		EditQualified editQualified = new EditQualified();
		editQualified.setIsQualified(!runningActivity.getQualified());
		editQualified.setRemarks(remarks);
		editQualified.setStudentId(runningActivity.getStudentId());
		editQualified.setRunningActivityId(runningActivityId);
		editQualified.setUserId(userId);
		editQualified.setUserName(username);
		editQualifiedMapper.insert(editQualified);
		runningActivity.setQualified(!runningActivity.getQualified());
		runningActivityMapper.updateByPrimaryKey(runningActivity);
		return ResponseEntity.status(HttpServletResponse.SC_CREATED).body("修改成功"); 
	}
}
