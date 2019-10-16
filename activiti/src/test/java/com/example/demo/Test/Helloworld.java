package com.example.demo.Test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;

public class Helloworld {
    //通过流程引擎可以创建各个阶段的service类，进行具体的操作
    ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();

    @Test
    public void deploymentProcessDefinition(){
        RepositoryService repositoryService = processEngine.getRepositoryService();//与流程定义和部署对象相关的service

//        repositoryService.createDeployment();//创建一个部署对象
        repositoryService.createDeployment().addClasspathResource("leave.xml").deploy();
    }
}
