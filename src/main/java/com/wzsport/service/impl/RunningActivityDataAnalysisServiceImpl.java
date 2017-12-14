package com.wzsport.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningActivityDataAnalysisMapper;
import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.mapper.SportDataValidateRuleMapper;
import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataAnalysis;
import com.wzsport.model.RunningActivityDataAnalysisExample;
import com.wzsport.model.RunningActivityDataExample;
import com.wzsport.model.SportDataValidateRule;
import com.wzsport.service.RunningActivityDataAnalysisService;
@Service
public class RunningActivityDataAnalysisServiceImpl implements RunningActivityDataAnalysisService {
	
	@Autowired
	private RunningActivityDataMapper runningActivityDataMapper;
	@Autowired
	private SportDataValidateRuleMapper sportDataValidateRuleMapper;
	@Autowired
	private RunningActivityDataAnalysisMapper runningActivityDataAnalysisMapper;
	
	@Override
	public RunningActivityDataAnalysis getDataAnalysisByRunningActivityId(Long id) {
		// TODO Auto-generated method stub	
		int collectionPointAmount = 0; //运动点总数
		int conformStepPerSecondAmount = 0;  //符合每秒步数的点数
		int conformDistancePerStepAmount = 0; //符合每步步幅的点数
		int conformSpeedAmount = 0; //符合速度的点数
		//找到id对应跑步记录所有数据点
		RunningActivityDataExample dataExample = new RunningActivityDataExample();
		dataExample.createCriteria().andActivityIdEqualTo(id);
		List<RunningActivityData> runningActivityDataList = runningActivityDataMapper.selectByExample(dataExample);
		//第一条数据直接不要
		collectionPointAmount = runningActivityDataList.size() - 1;
		//获取判断标准
		SportDataValidateRule rule = sportDataValidateRuleMapper.selectByPrimaryKey((long) 1);
		
		for (int i = 1;i < collectionPointAmount;i ++) {
			//计算本次记录距离上次记录的时间
			BigDecimal costTime = new BigDecimal ((runningActivityDataList.get(i).getAcquisitionTime().getTime() 
					- runningActivityDataList.get(i-1).getAcquisitionTime().getTime()) /1000);
			//计算距离差
			BigDecimal distance = new BigDecimal (runningActivityDataList.get(i).getDistance() 
					- runningActivityDataList.get(i-1).getDistance());
			//计算步数差
			BigDecimal stepCount = new BigDecimal (runningActivityDataList.get(i).getStepCount()
					- runningActivityDataList.get(i-1).getStepCount());
			
			//判断每步步幅是否符合标准
			stepCount = (stepCount.compareTo(new BigDecimal(0)) == 0) ? new BigDecimal(1) : stepCount;
			conformDistancePerStepAmount = (new BigDecimal(rule.getDistancePerStep()).multiply(stepCount)).compareTo(distance) == 1 ? 
					++ conformDistancePerStepAmount : conformDistancePerStepAmount;
			
			//判断符合速度的点数
			costTime = (costTime.compareTo(new BigDecimal(0))) == 0 ? new BigDecimal(1) : costTime;
			conformSpeedAmount = (new BigDecimal(rule.getSpeed()).multiply(costTime)).compareTo(distance) == 1 ? 
					++ conformSpeedAmount : conformSpeedAmount;
			
			//符合每秒步数的点数
			conformStepPerSecondAmount = (new BigDecimal(rule.getStepPerSecond()).multiply(costTime)).compareTo(stepCount) == 1 ?
					++ conformStepPerSecondAmount : conformStepPerSecondAmount;	
		}
		//插入数据并返回
		RunningActivityDataAnalysis runningActivityDataAnalysis = new RunningActivityDataAnalysis();
		
		RunningActivityDataAnalysisExample analysisExample = new RunningActivityDataAnalysisExample();
		analysisExample.createCriteria().andRunningActivityIdEqualTo(id);
		if (runningActivityDataAnalysisMapper.selectByExample(analysisExample).size() != 0) {
			runningActivityDataAnalysis = runningActivityDataAnalysisMapper.selectByExample(analysisExample).get(0);
		} else {
			runningActivityDataAnalysis = new RunningActivityDataAnalysis();
			runningActivityDataAnalysis.setRunningActivityId(id);
			runningActivityDataAnalysis.setCollectionPointAmount(collectionPointAmount);
			runningActivityDataAnalysis.setConformDistancePerStepAmount(conformDistancePerStepAmount);
			runningActivityDataAnalysis.setConformSpeedAmount(conformSpeedAmount);
			runningActivityDataAnalysis.setConformStepPerSecondAmount(conformStepPerSecondAmount);
			runningActivityDataAnalysisMapper.insert(runningActivityDataAnalysis);
		} 
		return runningActivityDataAnalysis;
	}	
	
}
