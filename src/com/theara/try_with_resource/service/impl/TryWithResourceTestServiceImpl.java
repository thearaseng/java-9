package com.theara.try_with_resource.service.impl;

import com.theara.service.TestService;
import com.theara.try_with_resource.MyResource;

public class TryWithResourceTestServiceImpl implements TestService {

    @Override
    public void test() {

        MyResource myResource = new MyResource();
        MyResource myResource2 = new MyResource();

        try(myResource; myResource2) {
            System.out.println("Testing 'Try with Resource'");
        }

    }

}
