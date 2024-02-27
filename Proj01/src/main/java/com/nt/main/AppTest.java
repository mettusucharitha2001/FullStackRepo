package com.nt.main;

import com.nt.service.ArithmeticOperations;

/**
 * Hello world!
 *
 */
public class AppTest 
{
    public static void main( String[] args )
    {
       ArithmeticOperations ar=new ArithmeticOperations();
        System.out.println("sum:"+(ar.sum(20,10)));   
        System.out.println("sub:"+(ar.sub(20,10)));//123 456
        System.out.println("mul:"+(ar.mul(2,1)));//901
    }
}