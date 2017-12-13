package com.soecode.m;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Zed on 2017/12/12.
 */

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-text,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉JUNIT spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {



}
