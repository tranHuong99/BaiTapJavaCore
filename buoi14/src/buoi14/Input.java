/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String inputId(){
        String tempId = this.scanner.nextLine();
        try{
            /*if(!tempId.startsWith("HV")) throw new Exception("Phai bat dau bang HV");
            String sub = tempId.substring(2);
            int parseInt = Integer.parseInt(sub);*/
            //Bieu thuc chinh quy
            if(!tempId.matches("HV[0-9]{3}")) throw new Exception("Phai bat dau bang HV va 3 so phia sau");
            
        }
        catch(Exception e){
            System.out.println("sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputId();
        }
        return tempId;
    }
    public String inputName(){
        String tempName = this.scanner.nextLine();
        try{
            if(tempName.length()<8) throw new Exception("Ten phai lon hon 8 ki tu");
        }
        catch(Exception e){
            System.out.println("sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return tempName;
    }
    public double inputMark(){
        double tempMark = this.scanner.nextDouble();
        return tempMark;
    }
}
