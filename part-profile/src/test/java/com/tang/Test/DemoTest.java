package com.tang.Test;

import com.tang.pojo.DemoBean;
import com.tang.utils.BeanConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description  SpringJunit4ClassRunner 在junit环境下提供Spring TestContext Framework的功能
 *  ContextConfiguration 用来加载配置ApplicationContext 其中classes属性用来加载配置类
 * @Author RLY
 * @Date 2018/12/11 15:09
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
@ActiveProfiles("dev")
public class DemoTest {

    @Autowired
    private DemoBean demoBean;

    @Test
    public void testContent(){
        String expected = "configuration product";
        String msg = demoBean.getMsg();
        Assert.assertEquals(expected, msg);
    }
}
