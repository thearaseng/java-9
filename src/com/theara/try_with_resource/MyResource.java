package com.theara.try_with_resource;

public class MyResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Dumpy output from close() of MyResource");
    }

}
