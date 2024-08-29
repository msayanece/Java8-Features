package com.me.functionalinterface;

public class TestMyOwnFuncInt {
    public static void main(String[] args) {

        /**
         * We must implement the abstract test method while implementing
         */
        MyOwnFuncInt myOwnFuncInt = new MyOwnFuncInt() {
            @Override
            public void test() {
                System.out.println("inside test");
            }
        };
        myOwnFuncInt.test();

        //Using lambda
        MyOwnFuncInt myOwnFuncInt1 = () -> System.out.println("inside test lambda");
        myOwnFuncInt1.test();
        /**
         * We can implement the equals method also
         */

        MyOwnFuncInt myOwnFuncInt2 = new MyOwnFuncInt() {
            @Override
            public void test() {
                System.out.println("inside test 2");
            }

            @Override
            public boolean equals(Object obj) {
                System.out.println("inside equals 1");
                return obj==null?false:super.equals(obj);
            }
        };
        myOwnFuncInt2.test();
        if (!myOwnFuncInt2.equals(null)) System.out.println("equals returned false");
    }
}
