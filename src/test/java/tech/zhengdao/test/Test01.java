package tech.zhengdao.test;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.junit.Test;

public class Test01 {
    /**
     * 获取流程引擎对象
     */
    @Test
    public void testProcessEngine(){
        ProcessEngineConfiguration configuration = new StandaloneProcessEngineConfiguration()
                .setJdbcDriver("com.mysql.cj.jdbc.Driver")
                .setJdbcUsername("root")
                .setJdbcPassword("root123")
                .setJdbcUrl("jdbc:mysql://localhost:3306/flowable_learn")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        // 创建数据库
        // create database flowable_learn default character set utf8mb4 collate utf8mb4_unicode_ci;

        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println("processEngine = " + processEngine);
    }
}
