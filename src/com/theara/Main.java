package com.theara;

import com.theara.collection_factory_method.service.impl.FactoryMethodTestServiceImpl;
import com.theara.service.TestService;

public class Main {

    public static void main(String[] args) {

        doTest(new FactoryMethodTestServiceImpl());

    }

    private static void doTest(TestService testService) {
        testService.test();
    }

}
