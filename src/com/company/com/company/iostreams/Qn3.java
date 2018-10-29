package com.company.com.company.iostreams;


import java.io.*;

//Copy a file to another using a buffered input stream

public class Qn3 {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = null;
        FileOutputStream out = null;
        BufferedInputStream bufferIn = null;

        try{
            reader = new FileInputStream("input.txt");
            out = new FileOutputStream("output2.txt");
            bufferIn = new BufferedInputStream(reader);

            while(bufferIn.available() > 0){
                char c = (char)bufferIn.read();

                out.write(c);
            }

        }catch(Exception e){
            System.out.println(e);
        }finally {
            if(reader != null){
                reader.close();
            }
            if(out != null){
                out.close();
            }
            if(bufferIn != null){
                bufferIn.close();
            }
        }
    }
}
