package com.example.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test01(){
        //过程引擎配置
        ProcessEngineConfiguration standaloneProcessEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        //对数据库的配置
        standaloneProcessEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        standaloneProcessEngineConfiguration.setJdbcUrl("jdbc:mysql://49.234.9.177:3306/activiti");
        standaloneProcessEngineConfiguration.setJdbcUsername("root");
        standaloneProcessEngineConfiguration.setJdbcPassword("3468989340");

        standaloneProcessEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        //工作流的核心对象 ProcessEngine对象
        ProcessEngine processEngine = standaloneProcessEngineConfiguration.buildProcessEngine();
        System.out.println(processEngine);
    }

    @Test
    public void test02(){
        ProcessEngineConfiguration processEngineConfigurationFromResource = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = processEngineConfigurationFromResource.buildProcessEngine();
        System.out.println(processEngine);
    }


    @Test
    public void deploymentProcessDefinition(){

    }
}
