package com.theara;

import com.theara.interface_private_method.service.impl.InterfacePrivateMethodTestServiceImpl;
import com.theara.service.TestService;

public class Main {

    public static void main(String[] args) {

        doTest(new InterfacePrivateMethodTestServiceImpl());

    }

    private static void doTest(TestService testService) {
        testService.test();
    }

}
