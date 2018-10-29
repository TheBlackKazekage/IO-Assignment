package com.company.com.company.iostreams;

//

import java.io.*;

public class Qn1 {

    public static void main(String[] args) throws IOException{
        FileInputStream reader = null;

        try{
            reader = new FileInputStream("input.txt");

            int c;
            while((c = reader.read()) != -1){
                System.out.print((char)c);
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            if(reader != null){
                reader.close();
            }
        }
    }
}
