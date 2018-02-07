package com.theara.collection_factory_method.service.impl;

import com.theara.service.TestService;

import java.util.List;
import java.util.Map;

public class FactoryMethodTestServiceImpl implements TestService {

    @Override
    public void test() {

        List<String> dummyList = List.of("Cambodia", "Khmer");

        System.out.println(dummyList);

        Map<String, Integer> dummyMap = Map.of("One", 1, "Two", 2);

        System.out.println(dummyMap);

    }

}
