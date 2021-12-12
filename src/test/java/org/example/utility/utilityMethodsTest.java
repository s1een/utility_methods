package org.example.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class utilityMethodsTest {
    @Test
    public void add_shouldAddTwoNumbers(){
        int a = 1;
        int b = 2;
        var result = utilityMethods.add(a,b);
        assertEquals(3,result);
    }

}