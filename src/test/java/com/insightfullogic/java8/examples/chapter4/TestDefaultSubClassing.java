package com.insightfullogic.java8.examples.chapter4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDefaultSubClassing {

    /**
     * 例4-12 在客户代码中使用默认方法
     */
    // BEGIN parent_default_used
    @Test
    public void parentDefaultUsed() {
        Parent parent = new ParentImpl();
        parent.welcome();
        assertEquals("Parent: Hi!", parent.getLastMessage());
    }
// END parent_default_used

    // BEGIN child_override_default
    @Test
    public void childOverrideDefault() {
        Child child = new ChildImpl();
        child.welcome();
        assertEquals("Child: Hi!", child.getLastMessage());
    }
// END child_override_default

    /**
     * 例4-16 调用的是类中的具体方法，而不是默认方法
     */
    // BEGIN concrete_beats_default
    @Test
    public void concreteBeatsDefault() {
        Parent parent = new OverridingParent();
        parent.welcome();
        assertEquals("Class Parent: Hi!", parent.getLastMessage());
    }
// END concrete_beats_default

    // BEGIN concrete_beats_closer_default
    @Test
    public void concreteBeatsCloserDefault() {
        Child child = new OverridingChild();
        child.welcome();
        assertEquals("Class Parent: Hi!", child.getLastMessage());
    }
// END concrete_beats_closer_default

}
