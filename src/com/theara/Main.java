package com.theara;

import com.theara.service.TestService;
import com.theara.try_with_resource.service.impl.TryWithResourceTestServiceImpl;

public class Main {

    public static void main(String[] args) {

        doTest(new TryWithResourceTestServiceImpl());

    }

    private static void doTest(TestService testService) {
        testService.test();
    }

}
