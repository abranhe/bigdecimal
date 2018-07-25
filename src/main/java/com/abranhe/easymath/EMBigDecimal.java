/**
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

package com.abranhe.easymath;

/**
 * Arithmetic operation in {@link BigDecimal} made easier
 * 
 * @repo https://github.com/abranhe/EasyMath-bigdecimal
 * @author Carlos Abraham
 * @version 0.0.1
 */

import java.math.BigDecimal;

public class EMBigDecimal {
    
    /**
     * Add two BigDecimal Numbers
     * 
     * @param x 
     * @param y
     * @return addition of x plus y
     */
    public static BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }

    /**
     * Subtract two BigDecimal Numbers
     * 
     * @param x
     * @param y
     * @return subtraction of x minus y
     */
    public static BigDecimal subtract(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
    
    /**
     * Multiply two BigDecimal Numbers
     * 
     * @param x
     * @param y
     * @return multiplication of x times y
     */
    public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }
    
    /**
     * Divide two BigDecimal Numbers
     * 
     * @param x
     * @param y
     * @return division between x and y
     */
    public static BigDecimal divide(BigDecimal x, BigDecimal y) {
        return x.divide(y);
    }
}
