package org.example;

import org.example.biz.BizService;
import org.example.biz.BizServiceWrapper;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //var bizService = context.getBean(BizService.class);

        var bizServiceWrapper = context.getBean(BizServiceWrapper.class);

        bizServiceWrapper.wrapperAction();
    }
}