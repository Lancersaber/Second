package com.example.demo.a_helloworld;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;

public class Helloworld {
    //通过流程引擎可以创建各个阶段的service类，进行具体的操作
    ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();

    public void deploymentProcessDefinition(){
        processEngine.getRepositoryService().   //与流程定义和部署对象相关的service
                createDeployment();         //创建一个部署对象
    }
}
