/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HUONG XINH GAI
 */
public class Buoi16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        SimpleVim sv = new SimpleVim();
        sv.newFile();
        sv.writeText();
    }
    
}
