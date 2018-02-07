package com.theara.interface_private_method;

public class IInterfaceImpl implements IInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Dumpy output from implementation of abstractMethod()");
    }

}
