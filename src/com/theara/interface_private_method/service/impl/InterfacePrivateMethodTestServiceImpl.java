package com.theara.interface_private_method.service.impl;

import com.theara.interface_private_method.IInterfaceImpl;
import com.theara.service.TestService;

public class InterfacePrivateMethodTestServiceImpl implements TestService {

    @Override
    public void test() {
        new IInterfaceImpl().defaultMethod();
    }

}
