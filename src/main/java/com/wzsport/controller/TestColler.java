package com.wzsport.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.service.RunningActivityDataAnalysisService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "使用新的方式审核数据给出结果")
@RestController
@RequestMapping(value="/test", produces="application/json;charset=UTF-8")
public class TestColler {
	
	RunningActivityMapper runningActivityMapper ;
	@Autowired
	RunningActivityDataAnalysisService runningActivityDataAnalysisService;
	
	@ApiOperation(value = "用新方式审核RunningActivity数据", notes = "审核所有历史运动记录数据")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<RunningActivity> create( ) {
		//遍历所有运动记录
		System.out.println("开始了");
		RunningActivityExample example = new RunningActivityExample();
		example.createCriteria().andIdIsNotNull();
		
		List<RunningActivity> lists = runningActivityMapper.selectByExample(example);
		System.out.println(lists.size());
		for (RunningActivity r : lists) {
			if (runningActivityDataAnalysisService.getDataAnalysisByRunningActivityId(r.getId()) != null);
				System.out.println(r.getId() + "插入成功");
		}
		
		System.out.println("jiesule");
		
		return ResponseEntity.ok().body(lists.get(0)); 
	}
	
	@Autowired(required = true)
	public void setRunningActivityMapper(RunningActivityMapper runningActivityMapper) {
		this.runningActivityMapper = runningActivityMapper;
	}
	
	
}
