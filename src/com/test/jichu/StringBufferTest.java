package com.test.jichu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StringBufferTest {
 public static void main(String [] args){
     String s1 = "budasidasik";
     byte[] a =s1.getBytes();
     String  b = new String(a);
     System.out.println(b);
     new Comparator(){

         @Override
         public int compare(Object o1, Object o2) {
             return 0;
         }
     };
     LocalDateTime localDateTime = LocalDateTime.now();
     DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
     String format = dateTimeFormatter.format(localDateTime);
     System.out.println(format);




 }

}
