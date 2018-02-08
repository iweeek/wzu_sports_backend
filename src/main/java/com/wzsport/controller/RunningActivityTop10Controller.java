/**
 * 
 */
package com.wzsport.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import com.wzsport.model.RunningActivityMesWithSportName;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * @author wenky
 *
 */
@Api(tags = "导出跑步运动前10名运动记录相关接口")
@RestController()
@RequestMapping(value = "/",produces = "application/json;charset=UTF-8")
public class RunningActivityTop10Controller {
	
	@Autowired
	private RunningActivityDataMapper runningActivityDataMapper;
	
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "导出excel文件", notes = "男生前10名运动记录")
	@RequestMapping(value = "/manTop10", method = RequestMethod.POST)
	public ResponseEntity<?> create() {
		
		List<RunningActivityMesWithSportName> ramwsn = 
				runningActivityDataMapper.selectByIsManAndNumber(1, 10);
		
		try {
		   WritableWorkbook wwb = null;       
           // 创建可写入的Excel工作簿
           String fileName = "F://boytop10.xls";
           File file=new File(fileName);
           if (!file.exists()) { file.createNewFile(); }
           //以fileName为文件名来创建一个Workbook
           wwb = Workbook.createWorkbook(file);
           // 创建工作表
           WritableSheet ws1 = wwb.createSheet("Test Shee 1", 0);
           //要插入到的Excel表格的行号，默认从0开始
           String[] titleArr= new String[]{"姓名","学号","性别","运动id","运动名称",
        		   "距离","耗费时间","速度","步数","步频","步幅"};
           for (int i = 0;i < titleArr.length;i ++) {
        	   Label lable = new Label(i,0,titleArr[i]);
        	   ws1.addCell(lable);
           }
           List<String> dataRow ;
           for (int i = 1;i <= ramwsn.size(); i++) {
        	   dataRow = new ArrayList<>();
        	   dataRow.add(ramwsn.get(i-1).getName());
        	   dataRow.add(ramwsn.get(i-1).getStudentNo());
        	   boolean isMan =  ramwsn.get(i-1).getIsMan() == 0 ? dataRow.add("女") : dataRow.add("男");
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getId()));
        	   dataRow.add(ramwsn.get(i-1).getSportName());
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getDistance()));
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getCostTime()));
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getSpeed()));
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getStepCount()));
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getStepPerSecond()));
        	   dataRow.add(String.valueOf(ramwsn.get(i-1).getDistancePerStep()));   	   
        	   for (int j = 0;j < titleArr.length;j ++) {
        		   Label lable = new Label(j,i,dataRow.get(j));
        		   ws1.addCell(lable);
               }
           }
           WritableSheet ws2 = wwb.createSheet("Test Shee 2", 1);
           String[] titleArr2= new String[]{"姓名","学号","运动id","间隔时间","步数","距离","步距","步频"};
           for (int i=0;i < titleArr2.length;i ++) {
        	   Label lable = new Label(i,0,titleArr2[i]);
        	   ws2.addCell(lable);
           }
           int num = 0;
           int col = 0;
           int index = 0;
           for (int i=0; i < ramwsn.size(); i++) {
        	   RunningActivityDataExample example = new RunningActivityDataExample();
        	   example.createCriteria().andActivityIdEqualTo(ramwsn.get(i).getId());
        	   List<RunningActivityData> rads = runningActivityDataMapper.selectByExample(example);
        	   List<String> dataRows ;
        	   for (int j = 1;j < rads.size(); j++) {
        		   col ++;
    			   num ++;
        		   dataRows = new ArrayList<>();
        		   dataRows.add(ramwsn.get(i).getName());
        		   dataRows.add(ramwsn.get(i).getStudentNo());
        		   dataRows.add(String.valueOf(ramwsn.get(i).getId()));
        		   dataRows.add(String.valueOf((rads.get(j).getAcquisitionTime().getTime() 
        				   - rads.get(j - 1).getAcquisitionTime().getTime()) / 1000));
        		   dataRows.add(String.valueOf(rads.get(j).getStepCount() 
        				   - rads.get(j - 1).getStepCount()));
        		   dataRows.add(String.valueOf(rads.get(j).getDistance() 
        				   - rads.get(j - 1).getDistance()));
        		   dataRows.add(String.valueOf(rads.get(j).getDistancePerStep()));
        		   dataRows.add(String.valueOf(rads.get(j).getStepPerSecond()));
        		   for (int k = 0;k < titleArr2.length;k ++) {
        			   if (num/50000 > index) {
        				   col = 1;
        				   index ++;
        				   ws2 = wwb.createSheet("Test Shee" + (2+index), 1+index);
        			   }
            		   Label lable = new Label(k,col,dataRows.get(k));
            		   ws2.addCell(lable);
                   }
        	   }
           }
           System.out.println(num);
          //写进文档
           wwb.write();
          // 关闭Excel工作簿对象
           wwb.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
		
		return null;
	}
}
