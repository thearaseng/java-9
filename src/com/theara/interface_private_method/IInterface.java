package com.theara.interface_private_method;

public interface IInterface {

    void abstractMethod();

    default void defaultMethod() {
        abstractMethod();
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Dumpy output from privateMethod()");
    }

}
