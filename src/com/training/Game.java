package com.training;
import java.util.*;

public class Game {
    public static void play(){
        Random r=new Random();
        int c=1;
        int num=r.nextInt(1000);
        Scanner sc=new Scanner(System.in);
        while(true){
            int p=sc.nextInt();
            if(p==num){
                System.out.println("Congrats!! You Guessed correct in " + c + " attempts.");
                break;
            }
            else{
                c++;
                System.out.print("You Entered ");
                if(p>num){
                    if(p-num > 100){
                        System.out.println("too high");
                    }
                    else{
                        System.out.println("bit high");
                    }
                }
                else{
                    if(num-p > 100){
                        System.out.println("too low");
                    }
                    else{
                        System.out.println("bit low");
                    }

                }
            }
        }
    }
}
