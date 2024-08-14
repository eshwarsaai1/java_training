package com.training.assignment1;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    BigInteger k= BigInteger.valueOf(5);
    private BigInteger add(BigInteger a, BigInteger b){
        return a.add(b);
    }
    private BigInteger subtract(BigInteger a,BigInteger b){
        return a.subtract(b);
    }
    private BigInteger multiply(BigInteger a, BigInteger b){
        return a.multiply(b);
    }
    private BigInteger divide(BigInteger a, BigInteger b){
        return  a.divide(b);
    }
    private BigInteger modulus(BigInteger a, BigInteger b){
        return a.remainder(b);
    }
    private BigInteger GCD(BigInteger a, BigInteger b){
        return a.gcd(b);
    }
    public void start(){
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
                    System.out.println( add(a,b) );
                    break;
                }
                case 2: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(subtract(a,b));
                    break;
                }
                case 3: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(multiply(a,b));
                    break;
                }
                case 4: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(divide(a,b));
                    break;
                }
                case 5: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(modulus(a,b));
                    break;
                }
                case 6: {
                    System.out.print("Enter first operand:");
                    BigInteger a = new BigInteger(sc.next());
                    System.out.print("Enter second operand:");
                    BigInteger b = new BigInteger(sc.next());
                    System.out.println(GCD(a,b));
                    break;
                }
                case 7:{
                    break;
                }
                default:
                    System.out.println("INVALID INPUT!!");
                    break;
            }
            if(opt==7) break;
        }
    }
}
