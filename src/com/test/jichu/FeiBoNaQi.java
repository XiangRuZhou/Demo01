package com.test.jichu;

public class FeiBoNaQi {
    public static void main(String [] args){
        FeiBoNaQi f = new FeiBoNaQi();
        for(int i =1;i<=10;i++){
            int a =f.printNum(i);
            System.out.print(a+",");
        }
    }
    public int printNum(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return printNum(n-1)+printNum(n-2);
        }
    }
}
