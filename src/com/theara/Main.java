package com.theara;

import com.theara.service.TestService;
import com.theara.try_with_resource.service.impl.TestServiceImpl;

public class Main {

    public static void main(String[] args) {

        doTest(new TestServiceImpl());

    }

    private static void doTest(TestService testService) {
        testService.test();
    }

}
