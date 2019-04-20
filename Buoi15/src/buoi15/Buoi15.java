/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi15;

import java.io.File;

/**
 *
 * @author HUONG XINH GAI
 */
public class Buoi15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("D:\\input.txt");
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
            System.out.println(f.mkdir());
            /*try{
                System.out.println(f.createNewFile());
            }
            catch(Exception e){
                e.printStackTrace();
            }*/
        }
        
        //
        FileUtils fu = new FileUtils();
        try{
            fu.write();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
