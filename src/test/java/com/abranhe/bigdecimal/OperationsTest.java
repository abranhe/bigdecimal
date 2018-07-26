/*
 * MIT License
 * 
 * Copyright (c) 2018 Abraham Hernandez
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.abranhe.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import junit.framework.TestCase;

/**
 * Test of class {@link com.abranhe.bigdecimal.Operations}.
 * @author Carlos Abraham
 */
public class OperationsTest extends TestCase {
    
    public OperationsTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of add method, of class Operations.
     */
    public void testAdd() {
        System.out.println("add");
        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");
        BigDecimal expResult = new BigDecimal("1112222211.2222222211");
        BigDecimal result = Operations.add(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Operations.
     */
    public void testSubtract() {
        System.out.println("subtract");
        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");
        BigDecimal expResult = new BigDecimal("-863086431.0246913569");
        BigDecimal result = Operations.subtract(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Operations.
     */
    public void testMultiply() {
        System.out.println("multiply");
        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");
        BigDecimal expResult = new BigDecimal("123030014929277547.5030955772112635269");
        BigDecimal result = Operations.multiply(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Operations.
     */
    public void testDivide() {
        System.out.println("divide");
        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");
        BigDecimal expResult = new BigDecimal("0.126124988");
        BigDecimal result = Operations.divide(x, y, 9, RoundingMode.FLOOR);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of divide method, of class Operations.
     */
    public void testDefaultDivide() {
        System.out.println("default divide");
        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");
        BigDecimal expResult = new BigDecimal("0.12613");
        BigDecimal result = Operations.divide(x, y);
        assertEquals(expResult, result);
    }
}
