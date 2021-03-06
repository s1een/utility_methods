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
    @Test
    public void sub_shouldSubTwoNumbers(){
        int a = 1;
        int b = 2;
        var result = utilityMethods.subtract(a,b);
        assertEquals(-1,result);
    }
    @Test
    public void mul_shouldMulTwoNumbers(){
        int a = 1;
        int b = 2;
        var result = utilityMethods.multiply(a,b);
        assertEquals(2,result);
    }
    @Test
    public void isEven_shouldReturnTrue(){
        int a = 2;
        var result = utilityMethods.isEven(a);
        assertTrue(result);
    }
    @Test
    public void isEven_shouldReturnFalse(){
        int a = 1;
        var result = utilityMethods.isEven(a);
        assertFalse(result);
    }
    @Test
    public void isOdd_shouldReturnFalse(){
        int a = 2;
        var result = utilityMethods.isOdd(a);
        assertFalse(result);
    }
    @Test
    public void isOdd_shouldReturnTrue(){
        int a = 1;
        var result = utilityMethods.isOdd(a);
        assertTrue(result);
    }
}