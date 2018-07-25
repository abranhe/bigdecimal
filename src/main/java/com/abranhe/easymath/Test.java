/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abranhe.easymath;

import java.math.BigDecimal;
import com.abranhe.easymath.EMBigDecimal;

/**
 *
 * @author abraham
 */
public class Test {
    public static void main(String[] args){
        
        BigDecimal bd1 = new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.123456789");
         
        BigDecimal add = EMBigDecimal.add(bd1, bd2);
        BigDecimal sub = EMBigDecimal.subtract(bd1, bd2);
        
        System.out.println(add); //=> 1112222211.2222222211
        System.out.println(sub); //=> 863086431.0246913569
    }
}
