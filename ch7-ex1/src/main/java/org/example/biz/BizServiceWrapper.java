package org.example.biz;

import org.springframework.stereotype.Service;

@Service
public class BizServiceWrapper {


    private final BizService bizService;

    public BizServiceWrapper(BizService bizService) {
        this.bizService = bizService;
    }

    public void wrapperAction() {

        System.out.println("Wrapper Action 시작!");

        bizService.action1();

        System.out.println("Wrapper Action 끝!");


    }

}