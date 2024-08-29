package com.me.functionalinterface;

@FunctionalInterface
public interface MyOwnFuncInt {

    /**
     * Test abstract method
     */
    void test();

    /**
     * using Object class's methods
     * to inform the caller that it has equals method also that they can call
     * directing the implementation that it might want to implement this method of Object class
     * @param obj an Object
     * @return true/false
     */
    boolean equals(Object obj);
}
