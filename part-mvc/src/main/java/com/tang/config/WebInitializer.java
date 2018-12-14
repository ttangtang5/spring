package com.tang.config;

import com.tang.filter.TimeFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 16:08
 * @Version 1.0
 **/
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(WebConfig.class);
        //applicationContext.setConfigLocations("classpath:shiro.xml","classpath:spring-shiro.xml","classpath:ehcache-shiro.xml");
        applicationContext.setServletContext(servletContext);

        //XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        //appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");

        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(applicationContext));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);

        ////配置spring
        //applicationContext.setInitParameter("contextConfigLocation","classpath:applicationContext_1.xml");
        //applicationContext.addListener(new ContextLoaderListener());
        ////配置springmvc
        //ServletRegistration.Dynamic servlet= servletContext.addServlet("spring",new DispatcherServlet());//加载springMVC核心类
        //servlet.addMapping("/");
        //servlet.setInitParameter("contextConfigLocation","classpath:servlet.xml");//设置springmvc的配置文件位置


        FilterRegistration.Dynamic filter = servletContext.addFilter("timeFilter", new TimeFilter());
        //EnumSet<DispatcherType> enumSet = EnumSet.allOf(DispatcherType.class);
        //enumSet.add(DispatcherType.REQUEST);
        filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");

    }
}
