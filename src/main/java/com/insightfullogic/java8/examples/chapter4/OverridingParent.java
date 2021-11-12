package com.insightfullogic.java8.examples.chapter4;

/**
 * 例4-15 重写welcome默认实现的父类
 */
// BEGIN body
public class OverridingParent extends ParentImpl {

    @Override
    public void welcome() {
        message("Class Parent: Hi!");
    }

}
// END body
