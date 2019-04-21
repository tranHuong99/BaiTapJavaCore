/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HUONG XINH GAI
 */
public class SimpleVim {
    public void newFile(){
        File f = new File("D:\\baitap.txt");
        if(f.exists()){
            if(f.isFile()){
                System.out.println(f.getAbsolutePath());
                System.out.println(f.getPath());
                System.out.println(f.getName());
                System.out.println("Đây là file");
            }
            else{
                System.out.println("Đây không phải là file");
                String[] list = f.list();
                for(String name: list)
                    System.out.println(name);
                //
                System.out.println(f.getTotalSpace());
                System.out.println(f.renameTo(new File("D:\\inputPro.txt")));
                File[] files = f.listFiles();
                for(File file: files)
                    if(file.getName().endsWith(".java"))
                        file.delete();
            }
        }
        else{
            System.out.println("File không tồn tại");
            try{
                System.out.println(f.createNewFile());
            }
            catch(Exception e){
            }
        }
    }
    public void writeText() throws FileNotFoundException, IOException {
        String path = "D:\\baitap.txt";
        File f = new File(path);
        byte bWrite [] = {11,21,3,40,5};
        try{
            try (FileOutputStream fos = new FileOutputStream("test.txt")) {
                for(int x = 0; x < bWrite.length ; x++) {
                    fos.write( bWrite[x] );
                }   // writes the bytes   }   
            } 
        } catch(FileNotFoundException e) {
        } catch(IOException e){
        }
    }

}
