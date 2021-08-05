package com.test.jichu;

public class BubbleSortTest {
    public static void  main(String [] args){
        int [] arrar = new int []{21,4,5,2,64,7585,8678,653,424,4234234,3253};
        for(int i =0;i<arrar.length-1;i++){
            for(int j = 0;j<arrar.length-1-i;j++){
                if(arrar[j]>arrar[j+1]){
                    int temp = arrar[j];
                    arrar[j] = arrar[j+1];
                    arrar[j+1]=temp;
                }
            }

        }

        for (int i =0;i<arrar.length;i++){
            System.out.print(arrar[i]+"\t");
        } }





}
