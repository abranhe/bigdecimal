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

/**
 * Arithmetic operations in {@link BigDecimal} made easier
 * 
 * @repo https://github.com/abranhe/bigdecimal
 * @author Carlos Abraham
 * @version 1.0.0
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operations {
    
    /**
     * Add two BigDecimal numbers
     * 
     * @param x Big decimal number
     * @param y Big decimal number
     * @return Addition of x plus y
     */
    public static BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }

    /**
     * Subtract two BigDecimal numbers
     * 
     * @param x Big decimal number
     * @param y Big decimal number
     * @return Subtraction of x minus y
     */
    public static BigDecimal subtract(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
    
    /**
     * Multiply two BigDecimal numbers
     * 
     * @param x Big decimal number
     * @param y Big decimal number
     * @return Multiplication of x times y
     */
    public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }
    
    /**
     * Divide two BigDecimal numbers
     * 
     * @param x Big decimal number
     * @param y Big decimal number
     * @param scale Scale of the BigDecimal quotient to be returned
     * @param roundingMode Rounding mode to apply
     * @return Division between x by y
     */
    public static BigDecimal divide(BigDecimal x, BigDecimal y, int scale, RoundingMode roundingMode) {
        return x.divide(y, scale, roundingMode);
    }
    
    /**
     * Default division between two BigDecimal numbers
     *  
     * <b>Default Values</b>
     * 
     * Source: 5
     * {@link java.math.RoundingMode}: CEILING
     * 
     * @param x Big decimal number
     * @param y Big decimal number
     * @return Division between x by y
     */
    public static BigDecimal divide(BigDecimal x, BigDecimal y) {
        return divide(x, y, 5, RoundingMode.CEILING);
    }
}
