package com.test;

public class Test01 {
    public static void main (String [] args){

        /*for (int i = 1;i<10;i++ ){ //外层U循环控制行数，内层循环控制列数
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println("\n");
        }*/

       lable:for(int i=2;i<=100;i++){
           for(int j =2;j<= Math.sqrt(i);j++){
               if(i % j == 0){
                   continue lable;
               }
           }
           System.out.print(i+" ");
       }


       //数组的复制
         String [] array1 =  new String[]{"11","22","223","33","aa","bb","cc","ee","zz","gg"};
         String [] array2 = new String[array1.length];
         for(int i =0;i<array2.length;i++){
           array2[i]=array1[i];
         }
        System.out.println();
        //反转
        for(int i =0;i<array1.length/2;i++){
             String temp = array1[i];
             array1[i] = array1[array1.length-1-i];
             array1[array1.length-1-i]=temp;
        }
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        //查找
       /* //(1)线性查找
        String ones = "11";
        for(int i = 0;i<array1.length;i++){
            if(ones.equals(array1[i])){
                System.out.println("找到指定元素，位置为："+i);
                break;
            }
        }*/

        //(2)二分查找法 (前提是数组有序）
        int [] array3 = new int[]{1,2,3,45,67,89,100,200,400,456};
        int start = 0;
        int end = array3.length-1;
        int serch = 400;
        boolean isFlag = true;
        while (start<end){
            int middle = (start+end)/2;
            if(serch==array3[middle]){
                System.out.println("找到所指定的元素，位置为："+middle);
                isFlag = false;
                break;
            }else if (serch>array3[middle]){
                start=middle+1;
            }else{
                end=middle-1;
            }

        }
        if(isFlag){
            System.out.println("未找到指定的元素");
        }


    }
}
