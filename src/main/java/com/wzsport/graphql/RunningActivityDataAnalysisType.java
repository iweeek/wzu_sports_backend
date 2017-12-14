package com.wzsport.graphql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wzsport.model.RunningActivityDataAnalysis;
import com.wzsport.service.RunningActivityDataAnalysisService;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;

@Controller
public class RunningActivityDataAnalysisType {
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	
	private static RunningActivityDataAnalysisService runningActivityDataAnalysisService;
	
	public static GraphQLObjectType getType() {
        if(type == null) {type = GraphQLObjectType.newObject()
                .name("RunningActivityDataAnalysis")
                .description("运动采集数据统计信息")
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("id")
                        .description("唯一主键")
                        .type(Scalars.GraphQLLong)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("runningActivityId")
                        .description("该数据关联的运动记录的ID")
                        .type(Scalars.GraphQLLong)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("collectionPointAmount")
                        .description("采集数据点的数量")
                        .type(Scalars.GraphQLInt)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("conformStepPerSecondAmount")
                        .description("符合每秒步数的点数")
                        .type(Scalars.GraphQLInt)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("conformDistancePerStepAmount")
                        .description("符合每步步幅的点数")
                        .type(Scalars.GraphQLInt)
                        .build())
                .field(GraphQLFieldDefinition.newFieldDefinition()
                        .name("conformSpeedAmount")
                        .description("符合速度的点数")
                        .type(Scalars.GraphQLInt)
                        .build())
                .build();
        }
        return type;
	}
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("runningActivityDataAnalysis")
	                .description("根据ID处理跑步记录数据")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	RunningActivityDataAnalysis runningActivityDataAnalysis = runningActivityDataAnalysisService.getDataAnalysisByRunningActivityId(id);
	                	return runningActivityDataAnalysis;
	                } ).build();
		}
        return singleQueryField;
    }
	@Autowired(required = true)
	public void setRunningActivityDataAnalysisService(
			RunningActivityDataAnalysisService runningActivityDataAnalysisService) {
		RunningActivityDataAnalysisType.runningActivityDataAnalysisService = runningActivityDataAnalysisService;
	}
	
	
}
