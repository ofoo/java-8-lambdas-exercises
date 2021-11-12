package com.insightfullogic.java8.examples.chapter4;

/**
 * 例4-11 Parent接口，其中的welcome是一个默认方法
 */
// BEGIN body
public interface Parent {

    public void message(String body);

    public default void welcome() {
        message("Parent: Hi!");
    }

    public String getLastMessage();

}
// END body
