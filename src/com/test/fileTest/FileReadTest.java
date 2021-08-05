package com.test.fileTest;

import org.junit.Test;

import java.io.*;

public class FileReadTest {
    @Test
    public void test1() {
        File file = new File("hello.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file,true);
            char[] chars = new char[10];
            int len;

            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars,0,len);
            }
            fileWriter.write("\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            fileReader = new FileReader(file);
            char[] chars1 = new char[10];
            int len1;
            while ((len1 = fileReader.read(chars1)) != -1) {
                for (int i = 0; i < len1; i++) {
                    System.out.print((chars1[i]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileReader !=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
