package com.theara.interface_private_method.service.impl;

import com.theara.interface_private_method.IInterfaceImpl;
import com.theara.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public void test() {
        new IInterfaceImpl().defaultMethod();
    }

}
