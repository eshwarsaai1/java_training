package com.training;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
//    BigInteger k= BigInteger.valueOf(5);
//    public BigInteger add(BigInteger a, BigInteger b){
//        return a.add(b);
//    }
//    public BigInteger subtract(BigInteger a,BigInteger b){
//        return a.subtract(b);
//    }
//    public BigInteger multiply(BigInteger a, BigInteger b){
//        return a.multiply(b);
//    }
//    public BigInteger divide(BigInteger a, BigInteger b){
//        return  a.divide(b);
//    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Choose Operation: \n 1.Addition \n 2.Subtraction \n 3.Multiplication\n 4.Division\n 5.Modulus \n 6.GCD \n 7.Exit");
            int opt = sc.nextInt();
            switch (opt) {
                case 1: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(a.add(b));
                    break;
                }
                case 2: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(a.subtract(b));
                    break;
                }
                case 3: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(a.multiply(b));
                    break;
                }
                case 4: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(a.divide(b));
                    break;
                }
                case 5: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(a.remainder(b));
                    break;
                }
                case 6: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(a.gcd(b));
                    break;
                }
                default:
                    break;
            }
            if(opt==7) break;
        }
    }
}
