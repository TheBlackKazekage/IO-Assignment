package com.company.com.company.iostreams;

import java.io.*;

public class Qn2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = null;
        FileOutputStream out = null;

        try{
            input = new InputStreamReader(System.in);
            out = new FileOutputStream("output.txt");

            System.out.println("Enter content to save to file: ");

            char c;
            do{
                c = (char)input.read();
                out.write(c);
            }while(c != 'q');

        }catch(Exception e){
            System.out.println(e);
        }finally{
            if(input != null){
                input.close();
            }
            if(out != null){
                out.close();
            }
        }
    }

    public static void keyboardContent(){

    }
}
