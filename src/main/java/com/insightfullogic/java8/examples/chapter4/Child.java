package com.insightfullogic.java8.examples.chapter4;

/**
 * 例4-13 继承了Parent接口的Child接口
 */
// BEGIN body
public interface Child extends Parent {

    @Override
    public default void welcome() {
        message("Child: Hi!");
    }

}
// END body
