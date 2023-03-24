package com.fivetran.helloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Make sure these tests succeed
 *
 * */
public class Spec {

    private static final int CAPITAL_A = 65;

    @Test
    public void main() {
        HelloWorld dummy = new HelloWorld();
        int ans = dummy.addTwoNumbers(5,3);
        assertEquals(8, ans);

    }
}
