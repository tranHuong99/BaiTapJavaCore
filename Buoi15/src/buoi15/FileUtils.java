/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author HUONG XINH GAI
 */
public class FileUtils {
    public void read() throws FileNotFoundException, IOException{
        String path = "D:\\input.txt";
        File f = new File(path);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(f))
        );
        /*Cách khác: BufferedReader reader1 = new BufferedReader(
                new InputStreamReader(System.in)
        );*/
        String line = reader.readLine();
        do{
            System.out.println(line);
            line = reader.readLine();
        }
        while(line!=null);

    }
    public void write() throws FileNotFoundException{
        String path = "D:\\input.txt";
        PrintWriter writer = new PrintWriter(path);
        writer.println("Hello!!!");
        writer.flush();
        writer.close();
    }
    public void readText() throws FileNotFoundException, IOException{
        String path = "D:\\input.txt";
        File f = new File(path);
        if(f.exists()){
            FileInputStream fis = new FileInputStream(f);
            int size = fis.available();
            for(int i=0;i<size;i++){
                System.out.print((char) fis.read() );
            }
        }
        else{
            System.out.println("Khong ton tai");
        }
    }
}
